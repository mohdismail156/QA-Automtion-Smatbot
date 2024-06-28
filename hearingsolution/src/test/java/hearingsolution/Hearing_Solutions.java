package hearingsolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hearing_Solutions {
	@Test
	public void hearingsolutions() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://hearingsolutions.in/");
		driver.get("https://hearingsolutions.in/");
		//driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(7000);
		
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().contains("May I know what are you looking for?")) {
			Thread.sleep(10000);
			Reporter.log("Checking the questing text here if it matches clicking on 'hearing test' button");
		driver.findElement(By.xpath("//label[@class='options-smatest'][@id='Hearing Test']")).click();
		Thread.sleep(10000);
		Reporter.log("Entering the name here");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(10000);
		}
		
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().contains("for whom do you require the service?")) {
			Thread.sleep(3000);
			Reporter.log("Checking the next question text here if it matches closing the bot");
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
		
}
}
