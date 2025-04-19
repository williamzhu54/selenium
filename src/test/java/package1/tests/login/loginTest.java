package package1.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import package1.base.baseTest;

public class loginTest extends baseTest {


    private String username = "standard_user";
    private String invPass = "asdcasd";

    @Test
    public void testLoginErrorMessage(){
        loginPage.loginApp(username, invPass);
        String actual = loginPage.getErrorMsg();
        Assert.assertTrue(actual.contains("Epic sadface"));
    }

}
