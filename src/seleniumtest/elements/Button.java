/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtest.elements;

import org.openqa.selenium.By;

/**
 *
 * @author TiMan
 */
public class Button extends BaseElement {

    public Button(By locator) {
        super(locator);
    }

    public void click() {
        waitUntilClickable().click();            
    }
}
