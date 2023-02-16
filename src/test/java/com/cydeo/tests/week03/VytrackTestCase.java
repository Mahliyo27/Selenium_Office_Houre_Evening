package com.cydeo.tests.week03;

import com.cydeo.utilities.VytrackUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VytrackTestCase extends VytrackProjectTestBase {

    @Test
    public void Test01(){

        //TC 1- As a user I should be able to see the labels
        // [“Home”,”About us”,”Our Approach”,”Products and Services”,”Contact”,”LOGIN”]
        //1- Open a chrome browser
        //2- Go to “https://vytrack.com/”
        //3- Verify that [“Home”,”About us”,”Our Approach”,”Products and Services”,”Contact”,” LOGIN”] is displayed

      //  WebElement homeElement = driver.findElement(By.xpath("//div[@class='logo_container']"));


        List<WebElement>link = driver.findElements(By.xpath("//ul[@id='top-menu']/li/a"));


        for (WebElement each : link) {
            System.out.println("each.getText() = " + each.getText());
        }


        List<String> expectedTopMenuList = new ArrayList<>(Arrays.asList("Home","About us","Our Approach","Products and Services","Contact","LOGIN"));

        List<String> actual = VytrackUtility.getElementText(link);
        Assert.assertEquals(actual,expectedTopMenuList);
    }

    @Test
    public void Test02(){


        //TC 2- As a user I should be able to see the labels [“Our Mission and Vision”,”Car Fleet Management”,”Newest Technologies”,””] under Our Approach
        //1- Open a chrome browser
        //2- Go to “https://vytrack.com/”
        //3- Verify that [“Our Mission and Vision”,”Car Fleet Management”] is displayed


        WebElement topMenuOurApproach = driver.findElement(By.xpath("//ul[@id='top-menu']//li[contains(.,'Our')]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(topMenuOurApproach).perform();


       // List<String> actualMenuText =VytrackUtility.getElementText(driver.findElements(By.xpath()))


    }
    @Test
    public void Test03() {

    }


    }