package com.freeCrm.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class loginStepDef {



    @Given("user is on the freeCRM page")
    public void user_is_on_the_freeCRM_page() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in by entering {string} and {string}")
    public void user_logs_in_by_entering_and(String string, String string2) {
        Driver.getDriver().findElement(By.cssSelector("[name='email']")).sendKeys("ahmet.phys@gmail.com");
        Driver.getDriver().findElement(By.cssSelector("[name='password']")).sendKeys("Physicist34", Keys.ENTER);
    }

    @When("clicks on contacts tab and then cicks on new")
    public void clicks_on_contacts_tab_and_then_cicks_on_new() {
       Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
       Driver.getDriver().findElement(By.xpath("//a//button[@class='ui linkedin button']")).click();
    }

    @Then("fill the info")
    public void fill_the_info(Map<String, String> data)  {
        Driver.getDriver().findElement(By.cssSelector("[name='first_name']")).sendKeys(data.get("firstname"));
        Driver.getDriver().findElement(By.cssSelector("[name='last_name']")).sendKeys(data.get("firstname"));
        Driver.getDriver().findElement(By.xpath("(//input[@class='search'])[1]")).sendKeys(data.get("Company"));
        BrowserUtils.waitPlease(3);
        Driver.getDriver().findElement(By.cssSelector("[class='ui linkedin button']")).click();
        BrowserUtils.waitPlease(3);
        Driver.getDriver().quit();
    }

}
