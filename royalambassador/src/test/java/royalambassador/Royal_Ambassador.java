package royalambassador;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Royal_Ambassador {
	@Test
	public void royalambassador() throws Exception {
		WebDriverManager.chromedriver().setup();
//	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Navigating to https://www.royalambassadorbh.com/");
		driver.get("https://www.royalambassadorbh.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Menu\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"reload\"]")).click();
		Thread.sleep(5000);
		Reporter.log("Selecting the English Language from here");
		if(driver.findElement(By.xpath("//*[@id=\"en\"]")).getText().equals("English")) {
		driver.findElement(By.xpath("//*[@id=\"en\"]")).click();
		Thread.sleep(3000);
		Reporter.log("Entering the name");
		driver.findElement(By.xpath("//*[@id=\"form-input-0\"]")).sendKeys("test");
		Reporter.log("Entering the email");
		driver.findElement(By.xpath("//*[@id=\"form-input-1\"]")).sendKeys("test@gmail.com");
		Reporter.log("Selecting the country India");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"form-input-2\"]")));
		select.selectByVisibleText("IND(+91)");
		Reporter.log("Entering the mobile number");
		driver.findElement(By.xpath("//*[@id=\"form-input-3\"]")).sendKeys("9876543210");
		Reporter.log("Clicking on submit button");
		driver.findElement(By.xpath("//*[@id=\"opened\"]/div[2]/div[6]/button")).click();
		Thread.sleep(5000);
		}
		Reporter.log("Checking the next question text here, it it matches closing the bot");
		if(driver.findElement(By.xpath("(//div[@class='options-div-smatest'])[last()]")).getText().equals("What can I help you with today?")) {
			driver.close();
		}
		else {
			Reporter.log("Did not work");
		}

}
}