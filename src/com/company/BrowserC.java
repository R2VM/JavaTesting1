package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserC {
    WebDriver driver;

    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.samachar.com");
        driver = new ChromeDriver();
        driver.get("https://youtube.com");
        Thread.sleep(1000);
        //driver.close();
    }
        public static void main (String[]args) throws InterruptedException {
        BrowserC obj = new BrowserC();
        obj.launchBrowser();
    }


}
