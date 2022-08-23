package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

import java.io.IOException;

public class registerPage extends Base{
    public void registerProcess(String lg, String ps, String pc, String fn, String ln, String em, String ic) throws IOException {
        goToRegPg();
        findByCss("[id='user_login']").sendKeys(lg);
        findByCss("[id='user_password']").sendKeys(ps);
        findByCss("[id='user_password_confirmation']").sendKeys(pc);
        findByCss("[id='user_firstname']").sendKeys(fn);
        findByCss("[id='user_lastname']").sendKeys(ln);
        findByCss("[id='user_mail']").sendKeys(em);
        findByCss("[id='user_custom_field_values_3']").sendKeys(ic);
        findByCss("[name='commit']").click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("testResult.png"));
    }
}
