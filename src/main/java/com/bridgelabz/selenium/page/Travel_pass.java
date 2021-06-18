/**
 * Description : Travel_Pass.java is test file which is having test cases for Travel_Pass.
 * Author      : Tushar Chawat
 * Date        : 13/06/2021
 */

package com.bridgelabz.selenium.page;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel_pass {
    @FindBy(xpath = "/html/body/div[2]/div/div/main/article/div/table[1]/tbody/tr[7]/td[2]/a")
    WebElement Maharashtra;

    @FindBy(xpath = "//a[text() = 'Pune police portal.']")
    WebElement Pune;

    public Travel_pass(WebDriver driver) {
        PageFactory.initElements(Base.driver, this);
    }

    public void pass() {
        Maharashtra.click();
        Pune.click();
    }
}
