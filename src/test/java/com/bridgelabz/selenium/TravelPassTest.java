/**
 * Description : Travel_Pass.java is test file which is having test cases for Travel_Pass.
 * Author      : Tushar Chawat
 * Date        : 13/06/2021
 */

package com.bridgelabz.selenium;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.listner.TestNGListner;
import com.bridgelabz.selenium.page.Pune_Portal;
import com.bridgelabz.selenium.page.Travel_pass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import static com.bridgelabz.selenium.utilities.Screenshot.capture;

@Listeners(TestNGListner.class)
public class TravelPassTest extends Base {
    public Travel_pass Travel;
    public Pune_Portal Portal;
    static ExtentTest test;
    static ExtentReports report;

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("C:\\Users\\Admin\\Travel_pass\\Extent_Report.html");
        test = report.startTest("Extent_Report");
    }

    @Test(priority = 0)
    public void travelPass() throws IOException {
        Travel = new Travel_pass(driver);
        Travel.pass();
        String Portal = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Pune Police - Digital Pass");
        if (Portal.equals("Pune Police - Digital Pass")){
            test.log(LogStatus.PASS, "Navigated to Pune Portal");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Passed");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Failed");
        }
    }

    @Test(priority = 1)
    public void punePortal() throws IOException, InterruptedException {
        Portal = new Pune_Portal(driver);
        Portal.portalPune();
    }

    @AfterClass
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
