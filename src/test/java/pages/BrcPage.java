package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Login']")
    public WebElement brclogin;
    @FindBy(xpath = "//*[@name=\"email\"]")
    public WebElement userEmail;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement brcpassword;
    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;


}
