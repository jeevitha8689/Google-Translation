package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranslatePage {
    private WebDriver driver;


    public TranslatePage(WebDriver driver) {
        this.driver = driver;
    }


//    @FindBy(xpath="//textarea[@aria-label='Source text']")
//    private WebElement testArea;
//
//     @FindBy(xpath ="//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[5]/button[1]/div[3]")
//     private WebElement selectLanguage;
//
//    @FindBy(xpath ="//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[2]/inpu")
//    private WebElement searchArea;
//
//    @FindBy(xpath ="//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[2]/c-wiz[1]/div[2]/div[1]/div[4]/div[1]/span[1]/div[1]")
//    private WebElement tamilLangugae;
//
//    @FindBy(xpath ="//div[contains(text(),'Sinhala')]")
//    private WebElement sinhalaLangugae;

    public void enterText(String text) {
        WebElement sourceLanguageInput = driver.findElement(By.xpath("//textarea[@aria-label='Source text']"));
        sourceLanguageInput.sendKeys(text);
    }

    public String getTranslation(String language) {
        WebElement translation = driver.findElement(By.xpath("//span[@lang='" + language + "']"));
        return translation.getText();
    }



}
