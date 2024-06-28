package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New_Zealand_Gateway {
	public static void main(String args[]) throws Exception {
    	Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver121\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
//Searching for New zealand Gateway bot	        
        StringSelection str = new StringSelection("9619242851");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
// entering menu to check if the bot is functional or not		
	    driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(15000);
		if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Kia Ora and Hello from New Zealand Gateway")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
			Thread.sleep(15000);
			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("May I have your full name?")){
				driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
				driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
				Thread.sleep(15000);
				if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Before we register, Can I have your email address for important updates")){
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("testfresh60@gmail.com");
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
					Thread.sleep(15000);
					if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Your registration was successful. Here are the event details")){
						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
						Thread.sleep(15000);
//Selecting Study in NZ option
						driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
						Thread.sleep(15000);
						if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("May I have your name please")){
//Entering the name							
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
							Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Can I also have your email address to share important updates")) {
//Entering email id									
									driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("ismail@infosys.com");
									driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
									Thread.sleep(15000);
								
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Thank you! My colleague will call you shortly and set up a meeting with our expert counsellors")){
									System.out.print("Bot Worked Fine");
								}
								}
							}
						}		
					}
				}
			}
		}
}
