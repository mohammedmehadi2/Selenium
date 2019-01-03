package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;
    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url){
        System.setProperty("webdriver.chrome.driver","/Users/mohammedmehadi/Desktop/WebAutomation/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();

    }
    public void typeOncss(String locator, String value){
       driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeonelement(String locator,String value){
        try {
            driver.findElement(By.cssSelector("#"+locator)).sendKeys(value);
        }catch (Exception ex1){
            System.out.println("cssSelector did not work");
            driver.findElement(By.id(locator)).sendKeys(value);
        }
        }
    public void typeonelementandenter(String locator,String value){
        try {
            driver.findElement(By.cssSelector("#"+locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1){
            System.out.println("cssSelector did not work");
            driver.findElement(By.id(locator)).sendKeys(value);
        }
    }
    public void navigateback(){
        driver.navigate().back();
    }

}
