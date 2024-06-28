package insta_and_fb;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forward_Insta {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Robot r = new Robot();
	driver.navigate().to("https://www.instagram.com");
	driver.manage().window().maximize();
	//entering username
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("9059062228");
	//entering password
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Ismail786$");
	//clicking on login button
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
	Thread.sleep(10000);
	//clicking on "Not now" option
//	driver.findElement(By.xpath("//div[@class='x9f619 x3nfvp2 xr9ek0c xjpr12u xo237n4 x6pnmvc x7nr27j x12dmmrz xz9dl7a xn6708d xsag5q8 x1ye3gou x80pfx3 x159b3zp x1dn74xm xif99yt x172qv1o x10djquj x1lhsz42 xzauu7c xdoji71 x1dejxi8 x9k3k5o xs3sg5q x11hdxyr x12ldp4w x1wj20lx x1lq5wgf xgqcy7u x30kzoy x9jhf4c']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/button[2]")).click();
//	Thread.sleep(5000);
	//clicking on message tab
	driver.get("https://www.instagram.com/direct/t/122705692453409/");
	Thread.sleep(5000);
	StringSelection str = new StringSelection("menu");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(7000);
	StringSelection str1 = new StringSelection("test");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(7000);
	if(driver.findElement(By.xpath("(//div[@class='x6prxxf x1fc57z9 x1yc453h x126k92a xzsf02u'])[last()]")).getText().equals("Thank you for contacting us, Please enter your email.")) {
		driver.close();
	}
	else {
		System.out.print("Did not work");
	}
	
}
}
