package FilloData;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.testng.annotations.BeforeTest;

public class InputData {
    Fillo fillo = new Fillo();
    Connection connection;
    {
        try {
            connection = fillo.getConnection("javaTask3Data.xlsx");
        } catch (FilloException e) {
            e.printStackTrace();
        }
    }
    //Data 1
    @BeforeTest
    public String login1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String Login1 = recordset.getField("Login");
        recordset.close();
        connection.close();
        return Login1;
    }
    @BeforeTest
    public String password1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String Password1 = recordset.getField("Password");
        recordset.close();
        connection.close();
        return Password1;
    }
    @BeforeTest
    public String passwordConf1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String PasswordConf1 = recordset.getField("Password confirmation");
        recordset.close();
        connection.close();
        return PasswordConf1;
    }
    @BeforeTest
    public String firstName1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String FirstName1 = recordset.getField("First name");
        recordset.close();
        connection.close();
        return FirstName1;
    }
    @BeforeTest
    public String lastName1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String LastName1 = recordset.getField("Last name");
        recordset.close();
        connection.close();
        return LastName1;
    }
    @BeforeTest
    public String email1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String Email1 = recordset.getField("Email");
        recordset.close();
        connection.close();
        return Email1;
    }
    @BeforeTest
    public String IRC1() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=1");
        recordset.moveFirst();
        String irc1 = recordset.getField("IRC");
        recordset.close();
        connection.close();
        return irc1;
    }
    //Data2
    @BeforeTest
    public String login2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String Login2 = recordset.getField("Login");
        recordset.close();
        connection.close();
        return Login2;
    }
    @BeforeTest
    public String password2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String Password2 = recordset.getField("Password");
        recordset.close();
        connection.close();
        return Password2;
    }
    @BeforeTest
    public String passwordConf2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String PasswordConf2 = recordset.getField("Password confirmation");
        recordset.close();
        connection.close();
        return PasswordConf2;
    }
    @BeforeTest
    public String firstName2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String FirstName2 = recordset.getField("First name");
        recordset.close();
        connection.close();
        return FirstName2;
    }
    @BeforeTest
    public String lastName2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String LastName2 = recordset.getField("Last name");
        recordset.close();
        connection.close();
        return LastName2;
    }
    @BeforeTest
    public String email2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String Email2 = recordset.getField("Email");
        recordset.close();
        connection.close();
        return Email2;
    }
    @BeforeTest
    public String IRC2() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=2");
        recordset.moveFirst();
        String irc2 = recordset.getField("IRC");
        recordset.close();
        connection.close();
        return irc2;
    }
    //Data 3
    @BeforeTest
    public String login3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String Login3 = recordset.getField("Login");
        recordset.close();
        connection.close();
        return Login3;
    }
    @BeforeTest
    public String password3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String Password3 = recordset.getField("Password");
        recordset.close();
        connection.close();
        return Password3;
    }
    @BeforeTest
    public String passwordConf3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String PasswordConf3 = recordset.getField("Password confirmation");
        recordset.close();
        connection.close();
        return PasswordConf3;
    }
    @BeforeTest
    public String firstName3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String FirstName3 = recordset.getField("First name");
        recordset.close();
        connection.close();
        return FirstName3;
    }
    @BeforeTest
    public String lastName3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String LastName3 = recordset.getField("Last name");
        recordset.close();
        connection.close();
        return LastName3;
    }
    @BeforeTest
    public String email3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String Email3 = recordset.getField("Email");
        recordset.close();
        connection.close();
        return Email3;
    }
    @BeforeTest
    public String IRC3() throws FilloException {
        Recordset recordset = connection.executeQuery("Select * from RegisterInfo").where("ID=3");
        recordset.moveFirst();
        String irc3 = recordset.getField("IRC");
        recordset.close();
        connection.close();
        return irc3;
    }
}