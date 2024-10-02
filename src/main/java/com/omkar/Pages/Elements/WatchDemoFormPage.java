package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WatchDemoFormPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public WatchDemoFormPage(WebDriver driver) {
        super(driver);
    }

    private WebElement firstName = driver.findElement(By.id("FirstName"));
    private WebElement lastName = driver.findElement(By.id("LastName"));
    private WebElement email = driver.findElement(By.id("Email"));
    private WebElement company = driver.findElement(By.id("Company"));
    private WebElement phone = driver.findElement(By.id("Phone"));
    private WebElement unitCount = driver.findElement(By.id("Unit_Count__c"));
    private WebElement jobTitle = driver.findElement(By.id("Title"));
    private WebElement identity = driver.findElement(By.id("demoRequest"));
    private WebElement watchDemoButton = driver.findElement(By.xpath("//button[@type='submit']"));

    public WatchDemoFormPage setFirstName(String key) {
        firstName.sendKeys(key);
        return this;
    }

    public WatchDemoFormPage setLastName(String key) {
        lastName.sendKeys(key);
        return this;
    }
    public WatchDemoFormPage setEmail(String key) {
        email.sendKeys(key);
        return this;
    }
    public WatchDemoFormPage setCompanyName(String key) {
        company.sendKeys(key);
        return this;
    }
    public WatchDemoFormPage setPhoneNumber(String key) {
        phone.sendKeys(key);
        return this;
    }

    public WatchDemoFormPage setUnitCount(String key) {
        Select dropdown = new Select(unitCount);
        dropdown.selectByValue(key);
        return this;
    }

    public WatchDemoFormPage setJobTitle(String key) {
        jobTitle.sendKeys(key);
        return this;
    }

    public WatchDemoFormPage setIdentity(String key) {
        Select dropdown = new Select(identity);
        dropdown.selectByValue(key);
        return this;
    }

    public void clickWatchDemoButton() {
        watchDemoButton.click();

    }
}

