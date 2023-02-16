package com.cydeo.tests.week02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_01 {





    WebDriver driver = new ChromeDriver();

    @BeforeMethod
            public void setUpMethod(){


        WebDriverManager.chromedriver().setup();



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://automationexercise.com");




    }




    @Test

    public void VerifyHome_page(){

        //3. Verify that home page is visible successfully
        ////4. Click on 'Signup / Login' button


        String actualTitle= driver.getTitle();
        String expectedTitle = "Automation Exercise";


        Assert.assertEquals(actualTitle,expectedTitle,"Home Page is NOT displayed");


        WebElement advertisementElement = driver.findElement(By.xpath("(//h2[1])"));

    //   Assert.assertTrue(advertisementElement.isDisplayed());


// Click on 'Signup / Login' button
        WebElement clickLogin = driver.findElement(By.xpath("//a[@href='/login']"));

       clickLogin.click();

        //5. Verify 'New User Signup!' is visible


       // WebElement NewUserSignup = driver.findElement(By.xpath("//h2[.='New User Signup!']"));

        WebElement NewUserSignup = driver.findElement(By.xpath("//div[@class='signup-form']//h2"));

        String actualUserSignup = NewUserSignup.getText();

        String expectedSingUp = "New User Signup!";


        Assert.assertEquals(actualUserSignup,expectedSingUp);


        //6. Enter name and email address




        WebElement dataQA = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));

        dataQA.sendKeys("Maya");

        WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

        email.sendKeys("mayaGad33@gmail.com");

        //7. Click 'Signup' button
        WebElement singUpButton = driver.findElement(By.xpath( "//button[@data-qa='signup-button']" ));

        singUpButton.click();


       // Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9.   // Fill details: Title, Name, Email, Password, Date of birth



        Assert.assertTrue(driver.findElement(By.xpath("//h2[.='Enter Account Information']")).isDisplayed());



    }










//
// 1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
// 3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
// 11. Select checkbox 'Receive special offers from our partners!'
// 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
// 14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//
//



    @AfterMethod
    public void tearDown(){

      //  driver.quit();
    }

}
