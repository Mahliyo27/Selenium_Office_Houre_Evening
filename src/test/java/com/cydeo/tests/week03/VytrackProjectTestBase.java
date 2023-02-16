package com.cydeo.tests.week03;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class VytrackProjectTestBase {

    WebDriver driver; // attribute of parent class

    @BeforeMethod
    public void setUpMethod(){


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://vytrack.com/");

    }



   @AfterMethod

    public void tearDown(){

        //driver.quit();
   }

}
