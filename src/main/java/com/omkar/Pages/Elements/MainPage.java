package com.omkar.Pages.Elements;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MainPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final WebElement watchDemo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/..//nav/div[5]/a[1]/div"));
    private final WebElement signIn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/..//nav/div[5]/a[2]"));
    List<WebElement> summitButtons= driver.findElements(By.xpath("//a[@href='https://summit.entrata.com/' and @class='nav-link last dropdown-menu-text---brix w-nav-link']"));

    public void verifyWatchDemoNavigation() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", watchDemo);
        Assert.assertEquals(driver.getCurrentUrl(),"https://go.entrata.com/watch-demo.html");
    }

    public void verifySignInPageNavigation() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.entrata.com/sign-in");
    }

    public void navigateToSummit(){

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(summitButtons.get(0)));
//
//        summitButtons.get(0).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", summitButtons.get(0));


        String originalTab = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

        Assert.assertEquals(driver.getCurrentUrl(),"https://summit.entrata.com/");
    }

}
