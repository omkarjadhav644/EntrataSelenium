package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SummitPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public SummitPage(WebDriver driver) {
        super(driver);
    }




    public void checkSummitRegistrationIsClosed() throws InterruptedException {

        Thread.sleep(3000);
        WebElement registerTosummit= driver.findElement(By.xpath("//*[@id='w-node-f9ecb30d-3ca4-bbe4-4935-b8c83b4703cc-1a24cff3']/a/div[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(registerTosummit));
        registerTosummit.click();

        wait.until(ExpectedConditions.urlToBe("https://web.cvent.com/event/d584d3ce-d8da-4cae-a33f-c2309d8c1900/summary"));

        Thread.sleep(5000);
        WebElement closedRegistrationTitle= driver.findElement(By.xpath("//*[@id='dialogHeader']/div"));
        wait.until(ExpectedConditions.visibilityOf(closedRegistrationTitle));
        Assert.assertEquals(closedRegistrationTitle.getText(),"Registration Closed");
    }

}
