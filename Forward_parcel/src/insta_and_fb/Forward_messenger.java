package insta_and_fb;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Forward_messenger {
public static void main(String[] args) throws Exception {
	Robot r = new Robot();
	ChromeOptions ops = new ChromeOptions();
    ops.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(ops);
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9059062228");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ismail786$");
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
	Thread.sleep(5000);
	driver.get("https://www.facebook.com/forwardparcelindia/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@aria-label='Message']")).click();
	Thread.sleep(3000);
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
//	String e = driver.findElement(By.xpath("(//div[@class='x1gslohp x11i5rnm x12nagc x1mh8g0r x1yc453h x126k92a'])[last()]")).getText();
//	System.out.print(e);
	if(driver.findElement(By.xpath("(//div[@class='x1gslohp x11i5rnm x12nagc x1mh8g0r x1yc453h x126k92a'])[last()]")).getText().equals("Thank you for contacting us, Please enter your email.")) {
		driver.close();
	}
	else {
		System.out.print("Did not work");
	}
	
	
}
}
