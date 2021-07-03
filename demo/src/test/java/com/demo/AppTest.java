package com.demo;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class AppTest 
{
    public String baseUrl = "https://www.google.com.ph/";
    public WebDriver driver;
        

    @BeforeTest 
    public void SetUp()
    {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\akosi\\Desktop\\DevFiles\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @Test
    public void SearchInGoogle() {
       driver.get(baseUrl);
       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("Hi");
    }
 
    @AfterTest

    public void quitChrome() {
        driver.close();
        System.out.println("Test Launched Successfully");
    }
}

