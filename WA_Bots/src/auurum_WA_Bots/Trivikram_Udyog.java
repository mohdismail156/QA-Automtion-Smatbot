package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Trivikram_Udyog {
	public static void main(String args[]) throws Exception {
    	Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver121\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
//Searching for Trivikram Udyog bot	        
        StringSelection str = new StringSelection("9370521201");
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
		if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
			Thread.sleep(15000);
			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
//Selecting Vivah from the 2 options				
				driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
				Thread.sleep(15000);
				if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
//Selecting 200 members from the 3 options available					
					driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-2]")).click();
					Thread.sleep(15000);
					if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------						
						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
						Thread.sleep(15000);
//Entering the mobile number 						
						if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
							Thread.sleep(15000);
							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
//Selecting Ithar from the 2 options				
							driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
							Thread.sleep(15000);
							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("समारंभ कोणता आहे")) {
//Entering the type of ceremony
								driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
								driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
								Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
//Selecting 150 members from the 3 options available					
								driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
								Thread.sleep(15000);
								if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------									
									driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
									driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
									Thread.sleep(15000);
									if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
										
									//Entering the mobile number
										driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
										driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
										Thread.sleep(15000);
										if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
							//Selecting Vivah from the 2 options				
											driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
											Thread.sleep(15000);
											if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
							//Selecting 500 members from the 3 options available					
												driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
												Thread.sleep(15000);
												if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------													
													driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
													driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
													Thread.sleep(15000);
													if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
														
														//Entering the mobile number
															driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
															driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
															Thread.sleep(15000);
															if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
												//Selecting Vivah from the 2 options				
																driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
																Thread.sleep(15000);
																if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
												//Selecting 500 above members from the 3 options available					
																	driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-1]")).click();
																	Thread.sleep(15000);
																	if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------																		
																		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
																		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																		Thread.sleep(15000);
																		//Entering the mobile number 						
																		if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
																			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
																			driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																			Thread.sleep(15000);
																			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
												//Selecting Ithar from the 2 options				
																			driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
																			Thread.sleep(15000);
																			if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("समारंभ कोणता आहे")) {
												//Entering the type of ceremony
																				driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
																				driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																				Thread.sleep(15000);
																				if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
												//Selecting 50 members from the 3 options available					
																				driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()-2]")).click();
																				Thread.sleep(15000);
																				if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------																					
																					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("menu");
																					driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																					Thread.sleep(15000);
																					if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("कृपया आपला मोबाईल नंबर प्रविष्ट करा")) {
																						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("9059059050");
																						driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																						Thread.sleep(15000);
																						if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("आपणास हॉल कोणत्या समारंभासाठी हवा आहे")) {
															//Selecting Ithar from the 2 options				
																						driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
																						Thread.sleep(15000);
																						if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("समारंभ कोणता आहे")) {
															//Entering the type of ceremony
																							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("test");
																							driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button")).click();
																							Thread.sleep(15000);
																							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("सभागृहाची आसन क्षमता किती अपेक्षित आहे")) {
															//Selecting 150 above members from the 3 options available					
																							driver.findElement(By.xpath("(//div[@class='_138Mo'])[last()]")).click();
																							Thread.sleep(15000);
																							if(driver.findElement(By.xpath("(//div[@class='_21Ahp'])[last()]")).getText().contains("https://joshigokhalecaterers.com/kakade-palace")) {
																								System.out.print("Bot Worked fine");
								}
									
							}	
					}
				}
				
			}
					}
				}
			}
		}
	}
}
																}
															}
													}
												}
											}
										}
									}
								}
								}
							}
							}
						}
					}
				}
			}
		}
	}
}
			