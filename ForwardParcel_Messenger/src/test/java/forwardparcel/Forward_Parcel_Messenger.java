package forwardparcel;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Forward_Parcel_Messenger {
	@Test
	public void messenger() throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Reporter.log("Logging into messemger account");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9393333142");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kulkarni@pec21");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		Thread.sleep(5000);
		Reporter.log("Searching for forward parcel messenger bot");
		driver.get("https://www.facebook.com/forwardparcelindia/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@aria-label='Message'])[1]")).click();
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
		if(driver.findElement(By.xpath("(//div[@class='html-div xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1h91t0o xkh2ocl x78zum5 xdt5ytf x13a6bvl x1eb86dx xhj03cu'])[last()]")).getText().equals("Please enter your name.")) {
			Reporter.log("Checking the question text here if it matches then entring the name");
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
		}

		if(driver.findElement(By.xpath("(//div[@class='html-div xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1h91t0o xkh2ocl x78zum5 xdt5ytf x13a6bvl x1eb86dx xhj03cu'])[last()]")).getText().equals("Thank you for contacting us, Please enter your email.")) {
			Reporter.log("Checking the next question text here if it matches then closing the bot");
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
		
}
}