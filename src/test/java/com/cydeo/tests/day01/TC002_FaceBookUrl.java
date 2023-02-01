package com.cydeo.tests.day01;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_FaceBookUrl {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();


        // Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        Thread.sleep(3000);



        //Verify url contains facebook
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);



        if (currentUrl.contains("facebook")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }



        String title = driver.getTitle();


        if (title.contains("Facebook")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }




        driver.navigate().to("https://www.google.com");

        Thread.sleep(3000);


       currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);



        if (currentUrl.contains("google")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }




         title = driver.getTitle();


        if (title.contains("Google")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }



        // Navigate back
      driver.navigate().back();
        Thread.sleep(3000);






        title = driver.getTitle();


        if (title.contains("Facebook")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }



        driver.navigate().forward();
        Thread.sleep(3000);


        System.out.println("currentUrl = " + currentUrl);

        //Verify url contains facebook
        currentUrl = driver.getCurrentUrl();


        if (currentUrl.contains("google")){


            System.out.println("PASS!!!");
        }else{
            System.out.println("FAILED");
        }




        driver.close();

        driver.quit();










    }
}
/*
TC #2: Title and Url check
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify url contains facebook
4. Verify title contains Facebook
5. Navigate to https://www.google.com
6. Verify url contains google
7. Verify title contains Google
8. Navigate back
9. Verify url contains facebook
10.Navigate forward
11.Verify url contains google
﻿
 */