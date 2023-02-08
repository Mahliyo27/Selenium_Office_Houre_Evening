package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoUtility {




    public static void clickLink(WebDriver driver,String str){

        driver.findElement(By.partialLinkText(str)).click();
    }


    public static void wait(int second){
        try {
            Thread.sleep(second *1000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
