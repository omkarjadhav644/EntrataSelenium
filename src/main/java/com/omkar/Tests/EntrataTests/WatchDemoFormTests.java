package com.omkar.Tests.EntrataTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.MainPage;
import com.omkar.Pages.Elements.WatchDemoFormPage;
import com.omkar.Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WatchDemoFormTests extends BaseTest {

    @Test(description = "Test to fill the demo form")
    public void verifySignInPageNavigation() throws InterruptedException {
        driver.get("https://www.entrata.com/");
        acceptCookie();
        MainPage mainPage = PageIntantiateFactory.getInstance(MainPage.class);
        mainPage.verifyWatchDemoNavigation();

        WatchDemoFormPage watchDemoFormPage= PageIntantiateFactory.getInstance(WatchDemoFormPage.class);
        watchDemoFormPage.setFirstName("Omkar");
        watchDemoFormPage.setLastName("Jadhav");
        watchDemoFormPage.setEmail("omkarjadhav644@gmail.com");
        watchDemoFormPage.setCompanyName("comapy_random");
        watchDemoFormPage.setPhoneNumber("9834130985");
        watchDemoFormPage.setUnitCount("11 - 100");
        watchDemoFormPage.setJobTitle("SDET");
        watchDemoFormPage.setIdentity("an Owner/Operator or Property Manager");

        Thread.sleep(3000);
       // watchDemoFormPage.clickWatchDemoButton();
    }

    public void acceptCookie(){
        if(driver.findElement(By.xpath("//*[@id='cookie-accept']")).isDisplayed()){
            driver.findElement(By.xpath("//*[@id='cookie-accept']")).click();
        }

    }
}
