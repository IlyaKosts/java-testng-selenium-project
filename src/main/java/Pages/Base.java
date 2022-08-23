package Pages;

import driver_managger.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    protected WebDriver driver;
    public Base() {
        this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
    public WebElement findByCss(String css) {
        return driver.findElement(By.cssSelector(css));
    }
    public void navBack(){
        driver.navigate().back();
    }

    public void goToRegPg() {
        driver.get("https://www.redmine.org/account/register");
    }

    public void commitBtnClick() {
        findByCss("[name='commit']").click();
    }
}
