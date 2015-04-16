package pages;

import lib.Web;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static lib.ConfigData.ui;

/**
 * Created with IntelliJ IDEA.
 * User: Luxoft QA
 * Date: 02.04.15
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class MainPage {
    static Logger log = Logger.getLogger(Loggin.class);
    static WebDriver driver;
    static WebDriverWait waitForElement;
    Web web;

    public MainPage(WebDriver driver) throws IOException {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, 10);
    }

    //Поиск по номеру телефона 380632106446
    public void searchByPhoneNumber() throws Exception {
        driver.findElement(ui("MainPage_DropDownSearchField")).click();
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("380632106446");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);

        String consumerNumber = "380632106446";
        String uniqueNumber = "57883";
        String SIMNumbe = "89380062208130461969";

        if (driver.findElement(ui("SearchResult_ConsumerNumber")).getText().equals(consumerNumber)) {
            log.info("Search result: ConsumerNumber - 380632106446");
        } else {
            log.error("Search result by ConsumerNumber is incorrect!");
        }

        if (driver.findElement(ui("SearchResult_UniqueNumber")).getText().equals(uniqueNumber)) {
            log.info("UniqueNumber - 57883 is correct");
        } else {
            log.error("Search result by UniqueNumber is incorrect!");
        }

        if (driver.findElement(ui("SearchResult_SIMNumber")).getText().equals(SIMNumbe)) {
            log.info("SIMNumber - 89380062208130461969 is correct");
        } else {
            log.error("Search result by SIMNumber is incorrect!");
        }

        if (driver.findElement(ui("SearchResult_ConsumerNumber")).getText().equals("380632106446") || driver.findElement(ui("SearchResult_UniqueNumber")).getText().equals("57883") || driver.findElement(ui("SearchResult_SIMNumber")).getText().equals("89380062208130461969")) {
            log.info("Search by phone number was correct");
        } else {
            log.error("Search by phone number was incorrect");
        }
    }

    //Поиск по номеру документа BB123456
    public void searchByDocumentNumber() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.findElement(ui("MainPage_DropDownSearchField")).click();
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("BB123456");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);

        if (driver.findElement(ui("SearchResult_DocumentLink")).isDisplayed()) {
            log.info("Search by document number was correct");
        } else {
            log.error("Search by document number was incorrect!");
        }
    }

    //Поиск по номеру контракта 300005289
    public void searchByContractNumber() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        driver.findElement(ui("MainPage_DropDownSearchField")).click();
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("300005289");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);

        String contractNumber = "15275";
        String contractType = "Контрактний Індивідуальний";

        waitForElement.until(ExpectedConditions.presenceOfElementLocated(ui("SearchResult_UniqueContractNumber")));


        if (driver.findElement(ui("SearchResult_UniqueContractNumber")).getText().equals(contractNumber)) {
            log.info("Search result: Unique Contract Number - 15275");
        } else {
            log.error("Unique Contract Number is incorrect!");
        }

        if (driver.findElement(ui("SearchResult_ContractType")).getText().equals(contractType)) {
            log.info("Contract Type - Контрактний Індивідуальний");
        } else {
            log.error("Contract Type is incorrect!");
        }
    }

    public void logout() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        waitForElement.until(ExpectedConditions.presenceOfElementLocated(ui("MainPage_SettingsButton")));

        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/ul/li[4]/a")).click();

        if (driver.findElement(ui("LogginField")).isDisplayed()) {
            log.info("User Logout was correct");
        } else {
            log.error("User Logout was incorrect!");
        }
    }
}
