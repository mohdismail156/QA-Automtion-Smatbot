package soschildrenvillage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sos_Children {
	@Test
	public void soschildren1() throws Exception {
	WebDriverManager.chromedriver().setup();
		
//    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//sos children
	Reporter.log("Navigating to https://www.soschildrensvillages.in");
	driver.navigate().to("https://www.soschildrensvillages.in");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"main_icon_smatest\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
	Thread.sleep(6000);
	Reporter.log("Checking if the question text is 'May I know your name?'");
	if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("May I know your name?")) {
		Reporter.log("Typing the name in the input field");
	driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
	driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
	Reporter.log("Now clicking on Send icon ");
	Thread.sleep(5000);
	}
	if(driver.findElement(By.xpath("(//label[@class='options-smatest'])[last()]")).getText().equals("Other")) {
		Reporter.log("Checking if the last button text is 'Other' if it matches closing the bot");
		driver.close();
	}
	else {
		Reporter.log("Did not work");
	}

}

}
