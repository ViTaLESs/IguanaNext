package com.iguanaNext.tests;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import lib.Iguana;
import lib.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Luxoft QA
 * Date: 14.04.15
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public class Simple2Test {
    private WebDriver driver;
    private Iguana iguana;
    Web web;

    //@BeforeMethod
    public void setUp() throws Exception {
        driver = new HtmlUnitDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        iguana = new Iguana(driver);
    }

    //@Test
    public void test2() throws Exception {
        driver.get("http://10.1.60.37:8080/inext/#/login");

        //driver.findElement(By.cssSelector("#username")).sendKeys("test-qa");
        //web.waitForElementPresent("LogginField");
        System.out.println(1);
        iguana.loggin.enterToSystem("test-qa", "123456aA");

        //Поиск по номеру телефона 380632106446
        iguana.mainPage.searchByPhoneNumber();
        //Поиск по номеру документа BB123456
        iguana.mainPage.searchByDocumentNumber();
        //Поиск по номеру контракта 300005289
        iguana.mainPage.searchByContractNumber();

        iguana.mainPage.logout();
    }


    //@AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }
}



