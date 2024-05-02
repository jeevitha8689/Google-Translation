package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;
    protected TranslatePage TranslatePage;
    @BeforeClass
    public void setUp() {
        System.setProperty("webDriver.chrome.driver ","C:\\Users\\Admin\\OneDrive\\Documents\\Jeevitha K\\chromedriver\\chromedriver.exe" );
        WebDriver  driver =new ChromeDriver();
        TranslatePage = new TranslatePage(driver);
        driver.get("https://translate.google.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
