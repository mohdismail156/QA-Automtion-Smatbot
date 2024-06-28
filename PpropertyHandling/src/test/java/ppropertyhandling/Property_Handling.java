package ppropertyhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Handling {
	@Test
	public void property() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://propertyhandling.com/");
		driver.get("https://propertyhandling.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here if it matches entering the name");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("May I please know your name?")) {
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on Send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here if it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Please Enter your mobile number")) {
		driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
	
}
	

}
