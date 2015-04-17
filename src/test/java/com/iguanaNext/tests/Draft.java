package com.iguanaNext.tests;

/**
 * Created with IntelliJ IDEA.
 * User: Luxoft QA
 * Date: 16.04.15
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class Draft {
    /*
            //login
        driver.findElement(ui("LogginField")).sendKeys("test-qa");
        Web.log.info("test-qa - was inputed into Login field");
        driver.findElement(By.name("username")).sendKeys(Keys.TAB);

        driver.findElement(By.name("password")).sendKeys("123456aA");
        Web.log.info("123456aA - was inputed into Password field");

        driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
        Web.log.info("User press ENTER");

        Web.waitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon")));
        Web.log.info("Login was correct");
        */


         /*
        //Поиск по номеру телефона 380632106446
        Web.waitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle")));
        driver.findElement(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle")).click();

        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("380632106446");
        Web.log.info("Enter in search field ConsumerNumber - 380632106446");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);
        Web.log.info("User press ENTER on search field");


        String consumerNumber = "380632106446";
        String uniqueNumber = "57883";
        String SIMNumbe = "89380062208130461969";


        if (driver.findElement(By.xpath(".//div[@class='module-panel']//span[@class='ng-binding']")).getText().equals(consumerNumber)) {
            Web.log.info("Search result: ConsumerNumber - 380632106446");
        } else {
            Web.log.error("Search result by ConsumerNumber is incorrect!");
        }

        if (driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[1]//td[@class='col-md-4 ng-binding']")).getText().equals(uniqueNumber)) {
            Web.log.info("UniqueNumber - 57883 is correct");
        } else {
            Web.log.error("Search result by UniqueNumber is incorrect!");
        }

        if (driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[9]//td[@class='col-md-4 ng-binding']")).getText().equals(SIMNumbe)) {
            Web.log.info("SIMNumber - 89380062208130461969 is correct");
        } else {
            Web.log.error("Search result by SIMNumber is incorrect!");
        }

        if (driver.findElement(By.xpath(".//div[@class='module-panel']//span[@class='ng-binding']")).getText().equals("380632106446") || driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[1]//td[@class='col-md-4 ng-binding']")).getText().equals("57883") || driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[9]//td[@class='col-md-4 ng-binding']")).getText().equals("89380062208130461969")) {
            Web.log.info("Search by phone number was correct");
        } else {
            Web.log.error("Search by phone number was incorrect!");
        }
        */


         /*
        //Поиск по номеру телефона 380632106446
        iguana.mainPage.searchByPhoneNumber();

        //Поиск по номеру документа BB123456
        driver.findElement(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle")).click();
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("BB123456");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);

        if (driver.findElement(By.xpath(".//table[@class='table']//tr[1]//button[@class='btn btn-link ng-binding']")).isDisplayed()) {
            Web.log.info("Search by document number was correct");
        } else {
            Web.log.error("Search by document number was incorrect!");
        }
        */


        /*
        //Поиск по номеру контракта 300005289
        driver.findElement(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle")).click();
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys("300005289");
        driver.findElement(By.xpath(".//input[@placeholder=\"Пошук\"]")).sendKeys(Keys.ENTER);

        String contractNumber = "15275";
        String contractType = "Контрактний Індивідуальний";

        Web.waitForElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[1]//td[@class='col-md-4 ng-binding']")));


        if (driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[1]//td[@class='col-md-4 ng-binding']")).getText().equals(contractNumber)) {
            Web.log.info("Search result: Unique Contract Number - 15275");
        } else {
            Web.log.error("Unique Contract Number is incorrect!");
        }

        if (driver.findElement(By.xpath(".//table[@class='customer-info table ng-scope']/tbody[4]//td[@class='col-md-4 ng-binding']")).getText().equals(contractType)) {
            Web.log.info("Contract Type - Контрактний Індивідуальний");
        } else {
            Web.log.error("Contract Type is incorrect!");
        }
        */


        /*
        //logout()
        //Web.waitForElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[1]/div[2]/div/div[3]/button[2]")));

        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/ul/li[4]/a")).click();

        if (driver.findElement(By.cssSelector("#username")).isEnabled()) {
            Web.log.info("User Logout was correct");
        } else {
            Web.log.error("User Logout was incorrect!");
        }

        */

}
