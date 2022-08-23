package driver_managger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;
    private static void setDriver() {

        driver = new ChromeDriver(WebDriverConfig.configChrome());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }
    public static void closeDriver() {
        driver.close();
        driver.quit();
    }
}
