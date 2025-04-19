package package1.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import poms.saucedemo.loginPage;
import poms.saucedemo.pages;

public class baseTest {

    protected WebDriver driver;
    protected pages page;
    protected poms.saucedemo.loginPage loginPage;
    private String url = "https://www.saucedemo.com/v1/index.html";

    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        page = new pages();
        page.setDriver(driver);
        loginPage = new loginPage();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}
