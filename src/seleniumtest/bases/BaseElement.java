/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtest.elements;

import java.util.List;
import javax.lang.model.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumtest.BaseDriver;

/**
 *
 * @author TiMan
 */
public class BaseElement {
    WebDriver driver = BaseDriver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 30);
    private By locator;

    public BaseElement(By locator) {
        this.locator = locator;
    }
    
    WebElement waitUntilVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    WebElement waitUntilClickable() {
           return wait.until(ExpectedConditions.elementToBeClickable(locator)); 
    }
    public boolean isDisplayed() {
        return waitUntilVisible().isDisplayed();
    }
    public boolean isEnabled() {
        return waitUntilVisible().isEnabled();
    }
    public String getText() {
        return waitUntilVisible().getText();
    }
    public String getAttribute(String attribute) {
        return waitUntilVisible().getAttribute(attribute);
    }
    protected List<WebElement> getElements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return (List<WebElement>) driver.findElement(locator);
    }
    public void clickESC() {
        driver.findElement(locator).sendKeys(Keys.ESCAPE);
    }
    
}
