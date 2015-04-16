package pages;

import lib.Web;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;


public class Loggin {
    static Logger log = Logger.getLogger(Loggin.class);
    static WebDriver driver;
    static WebDriverWait waitForElement;
    Web web;

    public Loggin (WebDriver driver) throws IOException {
        this.driver = driver;
        web = new Web(driver);
        waitForElement = new WebDriverWait(driver, 10);
    }
    public void enterToSystem(String user, String pass) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //driver.findElement(ui("LogginField")).getText();
        web.input("LogginField", user);
        log.info(user + " - was inputed into Login field");
        web.input("PasswordField", pass);
        log.info(pass + " - was inputed into Password field");
        web.clickButton("EnterButton");
        web.waitForElementPresent("Logo");
        log.info("Login was correct");
    }
}
