package com.practice;

import com.vytrack.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice1 {

    WebDriver driver;

    @Test
    public void scrollDown(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        BrowserUtils.waitPlease(3);
        Actions action = new Actions(driver);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,250)", "");
        BrowserUtils.waitPlease(1);
        javascriptExecutor.executeScript("window.scrollBy(0,250)", "");
        BrowserUtils.waitPlease(1);
        javascriptExecutor.executeScript("window.scrollBy(0,-250)", "");
        BrowserUtils.waitPlease(2);
        driver.close();

    }
}
