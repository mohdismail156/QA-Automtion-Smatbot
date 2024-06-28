package vinodrai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VinodRai {
	
		@Test
		public void vinod_rai() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://www.vinodrai.com/");
		driver.get("https://www.vinodrai.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(4000);
		Reporter.log("Checking the question text here if it matches, clicking on 'Yes' button");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Do you want to learn more about doing business in Rotational moulding?")) {
		driver.findElement(By.xpath("//*[@id=\"Yes\"]")).click();
		Thread.sleep(2000);
		Reporter.log("Entering the name");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on Send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the question text here, if it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("What is your company name?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
		}
	

}
