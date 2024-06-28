package forwardparcelinsta;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forward_Insta {
	@Test
	public void insta() throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		Reporter.log("Navigating to https://www.instagram.com");
		driver.navigate().to("https://www.instagram.com");
		driver.manage().window().maximize();
		//entering username
		Thread.sleep(5000);
		Reporter.log("Logging into instagram account");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("9059062228");
		//entering password
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Ismail786$");
		//clicking on login button
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
		Thread.sleep(10000);
		Reporter.log("Searching for forward parcel bot");
		driver.get("https://www.instagram.com/direct/t/122705692453409/");
		Thread.sleep(5000);
		Reporter.log("Entering menu");
		StringSelection str = new StringSelection("menu");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		Reporter.log("Clicking on send icon");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		
		if(driver.findElement(By.xpath("(//div[@class='x78zum5 xh8yej3'])[last()]")).getText().equals("Please enter your name.")) {
			Reporter.log("Checking the question text here if it matches, entering the name");
			StringSelection str1 = new StringSelection("test");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			Reporter.log("Entering the send icon");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='_a9-- _ap36 _a9_1']")).click();
			Thread.sleep(15000);
		}		
		if(driver.findElement(By.xpath("(//div[@class='x78zum5 xh8yej3'])[last()]")).getText().equals("Thank you for contacting us, Please enter your email.")) {
			Reporter.log("checking the next question text here if it matches, then closing the bot");
			driver.findElement(By.xpath("(//div[@class='x6s0dn4 x78zum5 xdt5ytf xl56j7k'])[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1uhb9sk x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1 xyamay9 x1l90r2v'])[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='xjbqb8w x1qhh985 xcfux6l xm0m39n x1yvgwvq x13fuv20 x178xt8z x1ypdohk xvs91rp x1evy7pa xdj266r x11i5rnm xat24cr x1mh8g0r x1wxaq2x x1iorvi4 x1sxyh0 xjkvuk6 xurb0ha x2b8uid x87ps6o xxymvpz xh8yej3 x52vrxo x4gyw5p xkmlbd1 x1xlr1w8']")).click();
			
			driver.close();
			
		}
		else {
			Reporter.log("Did not worked");
//			driver.close();
		}
	}
	}