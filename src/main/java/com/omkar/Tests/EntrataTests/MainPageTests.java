package com.omkar.Tests.EntrataTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.MainPage;
import com.omkar.Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {


    @Test(description = "Test to Verify Watch Demo page Navigation")
    public void verifyWatchDemoNavigation() {
        driver.get("https://www.entrata.com/");
        acceptCookie();
        MainPage mainPage = PageIntantiateFactory.getInstance(MainPage.class);

        mainPage.verifyWatchDemoNavigation();
    }

    @Test(description = "Test to VerifySign in page Navigation")
    public void verifySignInPageNavigation() {
        driver.get("https://www.entrata.com/");
        acceptCookie();
        MainPage mainPage = PageIntantiateFactory.getInstance(MainPage.class);
        mainPage.verifySignInPageNavigation();
    }

    public void acceptCookie(){
        if(driver.findElement(By.xpath("//*[@id='cookie-accept']")).isDisplayed()){
            driver.findElement(By.xpath("//*[@id='cookie-accept']")).click();
        }

    }
}
