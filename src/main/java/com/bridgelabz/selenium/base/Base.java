/**
 * Description : Travel_Pass.java is test file which is having test cases for Travel_Pass.
 * Author      : Tushar Chawat
 * Date        : 13/06/2021
 */

package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Base {
    public static WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    @BeforeTest
    public static void setup() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
        } catch (MalformedURLException e) {
            System.out.println("Internet is not connected");
        } catch (IOException e) {
            System.out.println("Internet is not connected");
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        tdriver.set(driver);
        driver.get("https://blog.savaari.com/road-travel-guidelines-during-covid/");
    }
    public static WebDriver getDriver() {
        return tdriver.get();
    }
}
