package oakridge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oak_Ridge {
	@Test
	public void oakridge() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://www.oakridge.in/");
		driver.get("https://www.oakridge.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here if it matches then clicking on the 'New Parent option");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Are you a new or an existing parent?")) {
		driver.findElement(By.xpath("//*[@id=\"New Parent\"]")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here if it matches then closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Type of school are you looking for?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
}
	
}
