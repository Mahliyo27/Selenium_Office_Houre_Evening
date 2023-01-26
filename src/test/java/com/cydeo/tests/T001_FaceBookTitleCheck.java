package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T001_FaceBookTitleCheck {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

       // WebElement facebook= driver.findElement(By.cssSelector(""));


       // Expected: “Facebook – log in or sign up”
        String expected ="Facebook - log in or sign up";




        String actual = driver.getTitle();


        if (expected.equals(actual)){
            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED!!!");
        }


        Thread.sleep(5000);

        driver.quit();





    }
}
/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook – log in or sign up”

 */