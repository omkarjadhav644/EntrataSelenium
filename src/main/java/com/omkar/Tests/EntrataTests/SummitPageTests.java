package com.omkar.Tests.EntrataTests;


import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.MainPage;
import com.omkar.Pages.Elements.SummitPage;
import com.omkar.Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SummitPageTests extends BaseTest {

    @Test(description = "Test to verify registration is closed for summit")
    public void checkSummitRegistration() throws InterruptedException {
        driver.get("https://www.entrata.com/");
        acceptCookie();
        MainPage mainPage = PageIntantiateFactory.getInstance(MainPage.class);
        mainPage.navigateToSummit();

        SummitPage summitPage= PageIntantiateFactory.getInstance(SummitPage.class);
        summitPage.checkSummitRegistrationIsClosed();

    }

    public void acceptCookie() {
        if (driver.findElement(By.xpath("//*[@id='cookie-accept']")).isDisplayed()) {
            driver.findElement(By.xpath("//*[@id='cookie-accept']")).click();
        }


    }
}
