package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WTE_Infra_Projects_Pvt_Ltd {
	public static void main(String args[]) throws Exception {
    	Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver121\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
//Searching for WTE Infra Projects Pvt Ltd bot	        
        StringSelection str = new StringSelection("8888889622");
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
		if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Please choose the language to start")) {
//Selecting English Language 			
			driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-2]")).click();
			Thread.sleep(15000);
			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Are you new to WTE")) {
//Selecting "Yes" new to WTE
				driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
				Thread.sleep(15000);
				if(driver.findElement(By.xpath("")).getText().contains("")) {
					
				}
			}
			
		}
		
	}
}
