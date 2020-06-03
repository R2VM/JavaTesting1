package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//public class Puppy {

public class Test5 {
    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avkin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.Google.com");
        //driver.findElement(By.id(("Search"))//*[@id="fakebox-input"]);
        //driver.findElement
    }
        public static void main(String[]args) {
            Test5 obj = new Test5();
            obj.launchBrowser();
        }

    }
          //public void Puppy(String name) {
            // This constructor has one parameter, name.
            //System.out.println("Passed Name is :" + name );


        //public static void main(String []args) {
            // Following statement would create an object myPuppy
            //Puppy myPuppy = new Puppy( "tommy" );



