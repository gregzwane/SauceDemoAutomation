package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class testBaseCI {
    private static WebDriver driver;

    public static void initialiseDriver()
    {
        String browser = System.getenv("BROWSER") != null ? System.getenv("BROWSER"): "firefox";
        boolean isHeadless = Boolean.parseBoolean(System.getenv("HEADLESS"));
        boolean isCI = Boolean.parseBoolean(System.getenv("CI"));
        if(isCI){
            isHeadless = true;
        }
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().browserVersion("140.0.0.");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--disable-notification");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                if(isHeadless) {
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                    chromeOptions.addArguments("--disable-gpu");
                }
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--width-1920");
                firefoxOptions.addArguments("--height-1080");

                if(isHeadless){
                    firefoxOptions.addArguments("--headless");
                    firefoxOptions.addArguments("--no-sandbox");
                    firefoxOptions.addArguments("--disable-notification");
                    firefoxOptions.addArguments("--disable-dev-shm-usage");
                    firefoxOptions.addArguments("--disable-gpu");
                }
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new IllegalArgumentException("Browser not supported " + browser );

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--width-1920");
                edgeOptions.addArguments("--height-1080");
                if(isHeadless){
                    edgeOptions.addArguments("--headless");
                    edgeOptions.addArguments("--no-sandbox");
                    edgeOptions.addArguments("--disable-notification");
                    edgeOptions.addArguments("--disable-dev-shm-usage");
                    edgeOptions.addArguments("--disable-gpu");
                }
                driver = new EdgeDriver(edgeOptions);
                break;
        }
        driver.get("https://www.saucedemo.com/");
    }

}
