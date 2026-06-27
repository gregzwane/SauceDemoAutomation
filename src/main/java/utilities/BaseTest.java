package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    private static WebDriver driver;


    public static void StartBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximum");
        options.addArguments("--disable-notification");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com.");

    }

    public static  WebDriver getWebDriver() {
        return driver;
    }
    public static void quiteDriver()
    {
        if(driver !=null){
            driver.quit();
        }
    }
}
