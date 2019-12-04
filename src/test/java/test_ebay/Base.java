package test_ebay;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void visit(String url){
        driver.get(url);
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }


}
