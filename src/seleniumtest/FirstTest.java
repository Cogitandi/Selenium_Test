/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumtest.elements.Button;
import seleniumtest.elements.TextBox;

/**
 *
 * @author TiMan
 */
public class FirstTest extends BaseTest {

    public void makeTest() {
        beforeTest();
        test();
        afterTest();
    }

    public void test() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("http://google.com");

        Button btn = new Button(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
        TextBox wyszukiwarka = new TextBox(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        wyszukiwarka.setText("testowy wpis do wyszukiwarki");
        btn.click();
    }

}
