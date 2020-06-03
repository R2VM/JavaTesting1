package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test4 {
    WebDriver driver;

    public void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.Google.com");
        Thread.sleep(1000);
    }

    public static void main (String[]args) throws InterruptedException {

Test4 obj = new Test4();
obj.launchBrowser();
   
    }
}
