package lib;

import org.openqa.selenium.WebDriver;
import pages.*;

/**
 * Created by vlaputko on 15.10.2014.
 */
public class Iguana {
    public Web web;
    public Util util;

    public Loggin loggin;
    public MainPage mainPage;


    static WebDriver driver;

    public Iguana(WebDriver driver) throws Exception {
        loggin = new Loggin(driver);
        mainPage = new MainPage(driver);

        util = new Util(driver);
        web  = new Web(driver);
    }
}
