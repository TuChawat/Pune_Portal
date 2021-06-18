/**
 * Description : Travel_Pass.java is test file which is having test cases for Travel_Pass.
 * Author      : Tushar Chawat
 * Date        : 13/06/2021
 */

package com.bridgelabz.selenium.page;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Pune_Portal {
    @FindBy(xpath = "//select[@name = 'CategoryReason']")
    WebElement Category;

    @FindBy(xpath = "//option[@value = 'Other']")
    WebElement Other;

    @FindBy(xpath = "//input[@id = 'AirPort_PNR']")
    WebElement Department;

    @FindBy(xpath = "//input[@id = 'FullName']")
    WebElement Name;

    @FindBy(xpath = "//input[@id = 'Hospital_Name']")
    WebElement ID;

    @FindBy(xpath = "//select[@class = 'form-control valid']")
    WebElement Gender;

    @FindBy(xpath = "//option[@value = 'M']")
    WebElement Male;

    @FindBy(xpath = "//input[@id = 'DOB']")
    WebElement DOB;

    @FindBy(xpath = "//input[@id = 'MobileNo']")
    WebElement Mobile;

    @FindBy(xpath = "//input[@id = 'AirPort_FlightNo']")
    WebElement Adhar;

    @FindBy(xpath = "//select[@id = 'Other_FromLocation']")
    WebElement From;

    @FindBy(xpath = "/html/body/div[2]/form/div/div/div[16]/div/select/option[13]")
    WebElement Pimpri;

    @FindBy(xpath = "//select[@id = 'Other_ToLocation']")
    WebElement To;

    @FindBy(xpath = "/html/body/div[2]/form/div/div/div[18]/div/select/option[18]")
    WebElement Pune;

    @FindBy(xpath = "//textarea[@id = 'Hospital_Aliment']")
    WebElement Extra;

    @FindBy(xpath = "//input[@class = 'big-checkbox']")
    WebElement Checkbox;

    public Pune_Portal(WebDriver driver) {
        PageFactory.initElements(Base.driver, this);
    }

    public void portalPune() throws IOException, InterruptedException {
        Category.click();
        Other.click();
        Department.sendKeys("Private");
        Name.sendKeys("Tushar");
        ID.sendKeys("TCL1111");
        ID.sendKeys(Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\AutoIT\\Photo.exe");
        Thread.sleep(2000);
        ID.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\AutoIT\\Bonafide.exe");
        Thread.sleep(2000);
        ID.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\AutoIT\\Id.exe");
        Thread.sleep(2000);
        Gender.click();
        Male.click();
        ID.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"01071997");
        Mobile.sendKeys("8888888888");
        Adhar.sendKeys("333344445555");
        Adhar.sendKeys(Keys.TAB,"16062021");
        Adhar.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"22062021");
        From.click();
        Pimpri.click();
        Thread.sleep(2000);
        To.click();
        Pune.click();
        Extra.sendKeys("NA");
        Extra.sendKeys(Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\AutoIT\\Id.exe");
        Thread.sleep(2000);
        Checkbox.click();
    }
}
