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

import java.time.LocalDate;


public class Main {

    Client client1 = new Client("Adam", "Kowal", LocalDate.of(1990,2,1),"9001012345","1234564376", "123xyz873S");




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
            driver.get("https://login.yahoo.com/account/create");

            WebElement name = driver.findElement(By.id("usernamereg-firstName"));name.sendKeys(client1.name);
            WebElement surname = driver.findElement(By.id("usernamereg-lastName"));surname.sendKeys(client1.surname);
            WebElement mail = driver.findElement(By.id("usernamereg-userId"));mail.sendKeys(client1.name + client1.surname);
            WebElement password = driver.findElement(By.id("usernamereg-password"));password.sendKeys(client1.password);
            WebElement month= driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]/option[" + client1.getMonthNumber() + "]"));month.click();
            WebElement day = driver.findElement(By.id("usernamereg-day"));day.sendKeys(client1.getDay());
            WebElement year = driver.findElement(By.id("usernamereg-year"));year.sendKeys(client1.getYear());
            WebElement button = driver.findElement(By.id("reg-submit-button"));button.click();


        }



}