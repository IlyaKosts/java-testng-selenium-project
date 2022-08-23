package UsersRegistration;

import FilloData.InputData;
import Pages.registerPage;
import com.codoid.products.exception.FilloException;
import driver_managger.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrationTest {

    @DataProvider(name = "dataForTest")
    public Object[][] getDataForTest() throws FilloException {
        String login1 = new InputData().login1();
        String password1 = new InputData().password1();
        String passwordConf1 = new InputData().passwordConf1();
        String firstName1 = new InputData().firstName1();
        String lastName1 = new InputData().lastName1();
        String email1 = new InputData().email1();
        String irc1 = new InputData().IRC1();

        String login2 = new InputData().login2();
        String password2 = new InputData().password2();
        String passwordConf2 = new InputData().passwordConf2();
        String firstName2 = new InputData().firstName2();
        String lastName2 = new InputData().lastName2();
        String email2 = new InputData().email2();
        String irc2 = new InputData().IRC2();

        String login3 = new InputData().login3();
        String password3 = new InputData().password3();
        String passwordConf3 = new InputData().passwordConf3();
        String firstName3 = new InputData().firstName3();
        String lastName3 = new InputData().lastName3();
        String email3 = new InputData().email3();
        String irc3 = new InputData().IRC3();

        Object[][] data = {{login1, password1, passwordConf1, firstName1, lastName1, email1, irc1},
                {login2, password2, passwordConf2, firstName2, lastName2, email2, irc2},
                {login3, password3, passwordConf3, firstName3, lastName3, email3, irc3}};
        return data;
    }

    @Test(description = "TS#1 Users registration with 1 invalid credential(TC#1: with invalid Email; TC#2: with invalid password; TC#3: with invalid confirmation.)",dataProvider = "dataForTest")
    public void regTest(String lg, String ps, String pc, String fn, String ln, String em, String ic) throws IOException {
        new registerPage().registerProcess(lg, ps, pc, fn, ln, em, ic);
    }

    @AfterTest
    public void kill() {
        DriverManager.closeDriver();
    }
}
