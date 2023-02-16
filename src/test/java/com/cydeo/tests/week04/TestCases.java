package com.cydeo.tests.week04;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.pages.HoversPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {


    CydeoPracticePage practicePage = new CydeoPracticePage();

    HoversPage hoversPage = new HoversPage();

    @AfterMethod
    public void tearDown() {


       // Driver.closeDriver();

    }

    @BeforeMethod
    public void setUpMethod(){

        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.practice.url"));

        practicePage = new CydeoPracticePage();





    }


    @Test
    public void test1() {


        practicePage.clickOption("Hovers");
        hoversPage.hoverOverUser(3);

    }
}
