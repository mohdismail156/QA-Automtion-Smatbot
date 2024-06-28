package modibuilders;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modi_Builders {
	@Test
	public void modibuilders() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Navigating to https://www.modibuilders.com/");
		driver.get("https://www.modibuilders.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here if it matches clicking on 'About Us' option");
		if(driver.findElement(By.xpath("//div[@class='options-div-smatest dialogs-div-more-vertical-smatest']")).getText().equals("What are you interested in learning about today?")) {
			Thread.sleep(5000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		       js.executeScript("window.scrollBy(0,-350)", "");
		       Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dialogs-div-vertical-smatest bot-google-font'])[1]")).click();
		
		}
		Thread.sleep(10000);
		Reporter.log("Checking the next question text here if it matches then closing the bot");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	       js1.executeScript("window.scrollBy(0,350)", "");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest dialogs-div-more-vertical-smatest'])[last()]")).getText().equals("What are you interested in learning about today?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}

}
	}

