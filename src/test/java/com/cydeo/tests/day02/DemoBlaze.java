package com.cydeo.tests.day02;

import com.cydeo.tests.utilities.DemoUtility;
import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoBlaze {


    /*
    Navigate to : https://demoblaze.com/index.html
    Click on Laptops category
    Click on Sony vaio 5
    Click on Add to cart
    Handle Alert
    Verify product is in the Cart
     */

    WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public void setUpMethod(){


        WebDriverManager.chromedriver().setup();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoblaze.com/index.html");
    }



    @Test
    public void TEST_02(){

//
//        Click on Laptops category
//        Click on Sony vaio 5
//        Click on Add to cart
//        Handle Alert
//        Verify product is in the Cart

        WebElement element = driver.findElement(By.xpath("//div[@class='list-group']//a[3]"));


        element.click();
    }



    @Test
    public void laptop(){

        DemoUtility.clickLink(driver,"Laptops");


        DemoUtility.clickLink(driver,"Sony vaio i5");



        DemoUtility.clickLink(driver,"Add to cart");

        DemoUtility.wait(2);

        Alert alert = driver.switchTo().alert();

        alert.accept();

        //go to cart
        DemoUtility.clickLink(driver,"Cart");


        Assert.assertTrue(driver.findElement(By.linkText("Delete")).isDisplayed());
        // verify that product is added



    }
}
