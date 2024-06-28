package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class Pandurang_Kumbar_Hospital {
	public static void main(String args[]) throws Exception {
    	Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver121\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
//Searching for Pandurang Kumbar Hospital bot	        
        StringSelection str = new StringSelection("9916233726");
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
		
// Checking the response text after hitting the menu
		String first = driver.findElement(By.xpath("(//div[@class='_1BOF7 _2AOIt'])[last()-1]")).getText();
		String second = driver.findElement(By.xpath("(//div[@class='_1BOF7 _2AOIt'])[last()]")).getText();
		
		if(first.contains("Pandurang Kumbar Hospital, Nagarmunolli") || second.contains("Pandurang Kumbar Hospital, Nagarmunolli")) {
//Three options are displayed Selecting appointment from it
			driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-2]")).click();
			Thread.sleep(10000);
			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Please select a type from below")) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
				Thread.sleep(10000);
				if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("To book your Appointment, please share few details.")){
//Selecting the karnataka state from the list			
					driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-2]")).click();
					Thread.sleep(10000);
//Selecting the date for appointment					
					driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[last()]")).click();
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
					Thread.sleep(10000);
					driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[last()]")).click();
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
					Thread.sleep(10000);
//typing the patient name
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
					Thread.sleep(10000);
//Entering the address
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("banjara hills smatbot");
					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
					Thread.sleep(10000);
//checking if the appointment got created or not
					if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Appointment Booked successfully")) {
						 Thread.sleep(15000);
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
							Thread.sleep(10000);
//Selecting hospital address
							driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
							Thread.sleep(10000);
							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("9M8J+W99, Near Pandurang Temple, Taluka Chikodi, District Belgaum, Nagamunnolli, Karnataka 591222")) {
//Hitting on Previous chat button								
								driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
								Thread.sleep(15000);
//Selecting Google Location	
								driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
								Thread.sleep(10000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://goo.gl/maps/4Hrg6YFcvDRaQzGcA")) {
//Clicking on End chat button									
									driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
									Thread.sleep(15000);
								
							}
							
						}
					}

			}
			
			
			
			
		}
		
		
}
}
}
