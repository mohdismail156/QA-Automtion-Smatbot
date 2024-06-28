package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PNG {
	public static void main(String args[]) throws Exception {
    	Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver121\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
//Searching for PNG bot	        
        StringSelection str = new StringSelection("PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//Entering the menu in the PNG bot	
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(15000);
	if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Welcome to M/s. Purushottam Narayan Gadgil, Saraf & Jewellers.")){

//if the text matches with the text of the response received then clicking on menu list		
	
//Clicking on menu list here
		driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
		Thread.sleep(5000);
//Selecting Today's rate from the menu list
		driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[1]")).click();
//Clicking on send icon
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
		Thread.sleep(15000);
//chekcing the text of the response received after selecting today's rate from the menu list
		if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText().contains("Gold Rate (per 10 grams)")) {
//clicking on main menu button if the text matches
			driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
			Thread.sleep(10000);
//Again here checking the text of the response received after hitting the main menu button
			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("Welcome to M/s. Purushottam Narayan Gadgil, Saraf & Jewellers.")) {
//If the text matches here clicking on menu list button
				driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
				Thread.sleep(5000);
//Selecting festive offers from the menu list
				driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[2]")).click();
//Clicking on send icon after selecting festive offers from the menu list
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
				Thread.sleep(10000);
//Selecting Gift voucher from the 2 options
				if(driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).getText().equals("Gift Voucher")) {
					driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
					Thread.sleep(15000);
					//checking the text of the document and clicking on main menu			
					String first = driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText();
					String second = driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText();

					if(first.equals("PNG Gift Voucher") || second.equals("PNG Gift Voucher")) {
					    driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
					    Thread.sleep(10000);
					    
//Clicking on menu list here
						driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
						Thread.sleep(5000);
//Selecting PNG Scheme from the menu list
						driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[3]")).click();
						Thread.sleep(2000);
//Clicking on send icon
						driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
						Thread.sleep(15000);
						
						
						String third = driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText();
						String fourth = driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-2]")).getText();
						String fifth = driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText();
						if(third.equals("SANCHAY SAMRUDDHI YOJANA (SSY)") || fourth.equals("SANCHAY SAMRUDDHI YOJANA (SSY)") || fifth.equals("SANCHAY SAMRUDDHI YOJANA (SSY)")) {
							driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
							Thread.sleep(5000);
							
							
							
	//Clicking on menu list here
							driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
							Thread.sleep(5000);
   // Selecting Store Locator from the menu list
							driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[4]")).click();
							Thread.sleep(2000);
	//Clicking on send icon
							driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
							Thread.sleep(15000);
							if(driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).getText().equals("MAHARASHTRA")) {
	// Selecting Maharashtra State from the options
							driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
							Thread.sleep(15000);
							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("MAHARASHTRA")) {
	//clicking on menu list of states for store locator
						    driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
							Thread.sleep(5000);
	//Selecting sangli saraf bazar from the menu list
								driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[1]")).click();
								driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
								Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText().contains(": 868, Saraf Bazar, Sangli -416416.")){
	//clicking on main menu
								driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
								Thread.sleep(10000);
	//Clicking on menu list here
								driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
								Thread.sleep(5000);
	// Selecting Why PNG? from the menu list
								driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[5]")).click();
	// Clicking on send icon
								driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
								Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText().contains("We provide all information to our customers regarding the metal type, purity, purchase, and sales transactional information. We do not levy any hidden charges in any transaction.")){
								driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
								Thread.sleep(10000);
	//Clicking on menu list here
								driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
								Thread.sleep(5000);
	// Selecting Feedback from the menu list
								driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[6]")).click();
	// Clicking on send icon
								driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
							    Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText().contains("https://forms.gle/JSVYXmUykuM3hX2F8")) {
	//clicking on main menu
								driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()-1]")).click();
								Thread.sleep(10000);
	//Clicking on menu list here
								driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n eujn52yf jfqm35v0 ckm995li bdbt56hn'])[last()]")).click();
								Thread.sleep(5000);
	// Selecting Contact Us from the menu list
								driver.findElement(By.xpath("(//button[@class='lhggkp7q qq0sjtgm tkdu00h0 ln8gz9je ppled2lx'])[7]")).click();
	// Clicking on send icon
								driver.findElement(By.xpath("//*[@id=\"app\"]/div/span[2]/div/div/div/div/div/div/div/span/div/div/div")).click();
								Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()-1]")).getText().contains("Toll Free Number - 18002331832")) {
								driver.findElement(By.xpath("(//div[@class='_3KCAK'])[last()]")).click();
															
														}
					}
								else {
									System.out.print("Bot Stopped Working");
								}


						}
								else {
									System.out.print("Bot Stopped Working");
								}
}
								else {
									System.out.print("Bot Stopped Working");
								}
}
							else {
								System.out.print("Bot Stopped Working");
							}
		}
							else {
								System.out.print("Bot Stopped Working");
							}
	}
						else {
							System.out.print("Bot Stopped Working");
						}
	}
					else {
		System.out.print("Bot Stopped Working");
	}
				}
				else {
					System.out.print("Bot Stopped Working");
				}
			}
			else {
				System.out.print("Bot Stopped Working");
			}
		}
		else {
			System.out.print("Bot Stopped Working");
		}
	}
	else {
		System.out.print("Bot Stopped Working");
	}
	}
}

