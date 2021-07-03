package com.demo;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    System.setProperty("webdriver.chrome.driver","C:\\Users\\akosi\\Documents\\VSCode\\TestAutomation\\MavenSample\\chromedriver.exe");
    driver = new ChromeDriver();
    } 


    /* 
    System.setProperty("webdriver.chrome.driver","C:\\Users\\akosi\\Desktop\\DevFiles\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        C:\\Users\\akosi\\Documents\\VSCode\\TestAutomation\\
        */ 
        
    @Test
    public void SearchInGoogle() {
        
       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium will search a keyword here");
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }

    @Test
    public void NavigateToGmail() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);
        WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
        gmail.click();
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);

    }

 
   @AfterTest

    public void quitChrome() {
        driver.close();
        System.out.println("Test Launched Successfully");
    }
}

