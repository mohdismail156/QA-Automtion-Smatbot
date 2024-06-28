package mmcivf;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mmc_Ivf {
	@Test
	public void mmcivf() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		Reporter.log("Navigating to https://www.mmcivf.com/ \n");
		driver.get("https://www.mmcivf.com/book-an-appointment");
		Thread.sleep(7000);
		
//		driver.findElement(By.xpath("//button[@class='close close-btn'][@aria-label='Close']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here if it matches clicing on 'Yes' button \n");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Are you looking to book an appointment with our medical professional?")) {
			Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Yes\"]")).click();
		Thread.sleep(4000);
	    Thread.sleep(2000);
	    Reporter.log("Entering the name \n");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		 Reporter.log("clicking on send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here if it matches closing the bot \n");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Hey test ! can I have your mobile number?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}
}
	

}
