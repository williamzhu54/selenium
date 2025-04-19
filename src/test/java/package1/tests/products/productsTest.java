package package1.tests.products;

import org.testng.annotations.Test;
import package1.base.baseTest;
import poms.saucedemo.productPage;

import static org.testng.Assert.assertTrue;

public class productsTest extends baseTest {

    private String username = "standard_user";
    private String pass = "secret_sauce";

    @Test
    public void testProductsDashboard(){
        productPage productsPage = loginPage.loginApp(username, pass);
        assertTrue(productsPage.isProductsDashboard());

    }

}
