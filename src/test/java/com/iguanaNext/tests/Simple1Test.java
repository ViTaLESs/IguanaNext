package com.iguanaNext.tests;

import com.sun.jna.platform.win32.WinUser;
import lib.ConfigData;
import lib.Iguana;
import lib.ThumbnailGenerator;
import lib.Web;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static lib.ConfigData.ui;



/**
 * Created with IntelliJ IDEA.
 * User: Luxoft QA
 * Date: 02.04.15
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class Simple1Test {
    private WebDriver driver;
    private Iguana iguana;
    Web web;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Tools\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");

        driver = new PhantomJSDriver(caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        iguana = new Iguana(driver);
    }

    @Test
    public void test1() throws Exception {


        driver.get("http://10.1.60.37:8080/inext/#/login");

        ThumbnailGenerator tg = new ThumbnailGenerator(driver);
        tg.setSize(1200, 800);
        tg.setBackgroundColor("#fff");

        try {
            tg.saveThumbnail("login.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a login screenshot");
        }

        //login to the system
        iguana.loggin.enterToSystem("test-qa", "123456aA");
        try {
            tg.saveThumbnail("mainPage.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a screenshot");
        }

        //Поиск по номеру телефона 380632106446
        iguana.mainPage.searchByPhoneNumber();
        try {
            tg.saveThumbnail("searchByPhoneNumber.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a searchByPhoneNumber screenshot");
        }

        //Поиск по номеру документа BB123456
        iguana.mainPage.searchByDocumentNumber();
        try {
            tg.saveThumbnail("searchByDocumentNumber.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a searchByDocumentNumber screenshot");
        }

        //Поиск по номеру контракта 300005289
        iguana.mainPage.searchByContractNumber();
        try {
            tg.saveThumbnail("searchByContractNumber.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a searchByContractNumber screenshot");
        }

        //logout
        iguana.mainPage.logout();
        try {
            tg.saveThumbnail("logout.png");
        } catch (IOException ioe) {
            Web.log.info("It was not possible make a logout screenshot");
        }

    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
