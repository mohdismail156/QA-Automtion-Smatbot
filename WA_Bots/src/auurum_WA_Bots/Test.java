package auurum_WA_Bots;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    private static List<TestResult> testResults = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        Robot r = new Robot();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver123\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:9222");
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(5000);
        try {
            // Step 1: Click on WhatsApp Web button
            driver.findElement(By.xpath("//*[@id='side']/div[1]/div/div[2]/button")).click();
            Thread.sleep(2000);

            // Step 2: Enter phone number
            StringSelection str = new StringSelection("9619242851");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_V);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(5000);

            // Step 3: Enter 'menu' to check if the bot is functional
            driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p"))
                .sendKeys("menu");
            driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[2]/button"))
                .click();
            Thread.sleep(15000);

            // Verify if the bot message is received
            if (driver.findElement(By.xpath("(//div[@class='_ahef'])[last()]"))
                .getText().contains("Kia Ora and Hello from New Zealand Gateway")) {
                addTestResult("Bot message received", true, "");
            } else {
                addTestResult("Bot message received", false, "Bot message not received");
            }

            // Add more test steps and verifications as needed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            printReportToFile("test_results.txt");
        }
    }

    public static void addTestResult(String testName, boolean passed, String message) {
        testResults.add(new TestResult(testName, passed, message));
    }

    public static void printReportToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Test Results:\n");
            for (TestResult result : testResults) {
                writer.write(result.getTestName() + ": " + (result.isPassed() ? "Passed" : "Failed") + "\n");
                if (!result.isPassed()) {
                    writer.write("Message: " + result.getMessage() + "\n");
                }
            }
            System.out.println("Test results have been written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to write test results to file: " + e.getMessage());
        }
    }

    static class TestResult {
        private String testName;
        private boolean passed;
        private String message;

        public TestResult(String testName, boolean passed, String message) {
            this.testName = testName;
            this.passed = passed;
            this.message = message;
        }

        public String getTestName() {
            return testName;
        }

        public boolean isPassed() {
            return passed;
        }

        public String getMessage() {
            return message;
        }
    }
}
