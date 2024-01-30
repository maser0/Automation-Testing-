package org.example;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

     private WebDriver driver;
     @BeforeAll
        public static void setupDriver(){
                WebDriverManager.firefoxdriver().setup();
        }
        @BeforeEach
        void setUP(){
        driver = new FirefoxDriver();
        }
        @AfterEach
        void tearDown(){
         driver.quit();
        }
        @Test
        void FirstTest(){
            driver.get("https://todomvc.datasette.io/");

           WebElement input = driver.findElement(By.xpath("//input[@class='new-todo']"));
           input.sendKeys("Selenium");
            WebElement button = driver.findElement(By.xpath("//a[@class='selected']"));
            button.click();
            


        }



}