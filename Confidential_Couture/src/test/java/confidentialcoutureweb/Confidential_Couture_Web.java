package confidentialcoutureweb;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confidential_Couture_Web {
	@Test
	public void confidential() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://confidentialcouture.com/");
		Reporter.log("Navigating to https://confidentialcouture.com/\n\n");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text if it matches clicking on 'Buy' button");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Please select from the below options")) {
		driver.findElement(By.xpath("//*[@id=\"Buy\"]")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the question text of next question here if it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Please select from the below one")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
}
	

}
