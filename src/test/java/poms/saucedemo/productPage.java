package poms.saucedemo;

import org.openqa.selenium.By;

public class productPage extends pages{

    private By title = By.className("product_label");

    public boolean isProductsDashboard(){
        return find(title).isDisplayed();
    }

}
