package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@href='/login']")
    public WebElement signupPage;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement signupName;
    @FindBy(xpath = "(//*[@type='email'])[2]")
    public WebElement signupEmail;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement signupClick;
    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement signupTitle;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement signupPassword;
    @FindBy(xpath = "//*[@id='days']")
    public WebElement signupDays;
    @FindBy(xpath = "//*[@id='months']")
    public WebElement signupMonths;
    @FindBy(xpath = "//*[@id='years']")
    public WebElement signupYear;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement signupFirstName;
    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement signupLastName;
    @FindBy(xpath = "//*[@id='company']")
    public WebElement signupCompany;
    @FindBy(xpath = "//*[@id='address1']")
    public WebElement signupAddressOne;
    @FindBy(xpath = "//*[@id='address2']")
    public WebElement signupAddressTwo;
    @FindBy(xpath = "//*[@id='country']")
    public WebElement signupCountry;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement signupState;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement signupCity;
    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement signupZipCode;
    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement signupMobileNumber;
    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement signupCreateAccount;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement signupAccountCreatedAssert;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signupContinueclickAfterCreated;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggeedInAs;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addToCartOne;
    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[3]")
    public WebElement addToCartTwo;
    @FindBy(xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement cartButton;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "(//*[@class='heading'])[1]")
    public WebElement addressDetails;
    @FindBy(xpath = "(//*[@class='heading'])[2]")
    public WebElement reviewYourOrder;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement commentCheckout;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrder;
    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//*[@name='card_number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//*[@name='cvc']")
    public WebElement cvc;
    @FindBy(xpath = "//*[@name='expiry_month']")
    public WebElement expirationMonths;
    @FindBy(xpath = "//*[@name='expiry_year']")
    public WebElement expirationYears;
    @FindBy(xpath = "//*[@id='submit']")
    public WebElement payAndConfirmOrder;
    @FindBy(xpath = "//*[@class='alert-success alert']")
    public WebElement yourOrderPlacedSuccessFully;
    @FindBy(xpath = "//*[@href='/delete_account']")
    public WebElement deleteAccount;






}