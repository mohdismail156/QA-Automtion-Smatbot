package metapoint;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meta_Point {
	@Test
	public void metapoint() throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://www.metapoint.in/");
		driver.get("https://www.metapoint.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Checking the question text here if it matches entering the name");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("Can I know your name?")) {
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/input")).sendKeys("test");
		Reporter.log("Clicking on send icon");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[3]/img")).click();
		Thread.sleep(6000);
		}
		Reporter.log("Checking the next question text here if it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().contains("Please share your mobile no to get in touch with our team")) {
			driver.close();
		}
		else {
			Reporter.log("Did not worked");
		}


}
	
}
