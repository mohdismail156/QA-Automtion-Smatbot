package forwardparcelweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forward_Parcel_Web {
	@Test
	public void forwardparcel() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.forwardparcel.com/");
		Reporter.log("Navigating to https://www.forwardparcel.com/ \n");
		Thread.sleep(35000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here and if it matches entering the name \n");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().contains("enter your name.")) {
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on send icon \n");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here if it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Thanks test, please enter your email.")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
	}
}
