package ducatindia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ducat_India {
	@Test
	public void ducat() throws Exception {
		WebDriverManager.chromedriver().setup();
	    	// System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");

WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://ducatindia.com/");
		Reporter.log("Navigating to https://ducatindia.com/");
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	     js.executeScript("window.scrollBy(0,-350)", "");
	     
		Reporter.log("Checking the question text here if it matches entering the name");
		if(driver.findElement(By.xpath("//div[@class='options-div-smatest']")).getText().equals("May I know your name?")) {
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img[1]")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here if it matches then closing the bot");
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@id=\"radio-question-div-2\"]/div[2]")).getText().equals("Do you want to enquire about any course?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
}
	
	

}
