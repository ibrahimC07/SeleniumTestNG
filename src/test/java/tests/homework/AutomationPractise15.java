package tests.homework;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPractise15 {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click 'Signup / Login' button
    //5. Fill all details in Signup and create account
    //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
    //7. Verify ' Logged in as username' at top
    //8. Add products to cart
    //9. Click 'Cart' button
    //10. Verify that cart page is displayed
    //11. Click Proceed To Checkout
    //12. Verify Address Details and Review Your Order
    //13. Enter description in comment text area and click 'Place Order'
    //14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
    //15. Click 'Pay and Confirm Order' button
    //16. Verify success message 'Your order has been placed successfully!'
    //17. Click 'Delete Account' button
    //18. Verify 'ACCOUNT DELETED!' and click 'Continue' button


    @Test
    public void test01() throws InterruptedException {
        Faker faker = new Faker();
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("automationUrl"));
        //4. Click 'Signup / Login' button
        automationExercisePage.signupPage.click();
        //5. Fill all details in Signup and create account
        automationExercisePage.signupName.sendKeys(faker.name().firstName());
        automationExercisePage.signupEmail.sendKeys(faker.internet().emailAddress());
        automationExercisePage.signupClick.click();
        //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        automationExercisePage.signupTitle.click();
        automationExercisePage.signupPassword.sendKeys(faker.number().digits(5));
        automationExercisePage.signupDays.sendKeys("1");
        automationExercisePage.signupMonths.sendKeys("October");
        automationExercisePage.signupYear.sendKeys("1994");
        automationExercisePage.signupFirstName.sendKeys(faker.name().firstName());
        automationExercisePage.signupLastName.sendKeys(faker.name().lastName());
        automationExercisePage.signupCompany.sendKeys(faker.company().name());
        automationExercisePage.signupAddressOne.sendKeys(faker.address().streetAddress());
        automationExercisePage.signupAddressTwo.sendKeys(faker.address().fullAddress());
        automationExercisePage.signupCountry.sendKeys("India");
        automationExercisePage.signupState.sendKeys(faker.address().state());
        automationExercisePage.signupCity.sendKeys(faker.address().city());
        automationExercisePage.signupZipCode.sendKeys(faker.address().zipCode());
        automationExercisePage.signupMobileNumber.sendKeys(faker.phoneNumber().cellPhone());
        automationExercisePage.signupCreateAccount.click();
        //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        Assert.assertTrue(automationExercisePage.signupAccountCreatedAssert.isDisplayed());
        automationExercisePage.signupContinueclickAfterCreated.click();
        //7. Verify ' Logged in as username' at top
        Assert.assertTrue(automationExercisePage.loggeedInAs.isDisplayed());
        //8. Add products to cart
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.addToCartOne);
        jse.executeScript("arguments[0].click();",automationExercisePage.addToCartOne);
        automationExercisePage.continueShopping.click();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.addToCartTwo);
        jse.executeScript("arguments[0].click();",automationExercisePage.addToCartTwo);
        automationExercisePage.continueShopping.click();
        //9. Click 'Cart' button
        automationExercisePage.cartButton.click();
        //10. Verify that cart page is displayed
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("automationCartPage"));
        //11. Click Proceed To Checkout
        automationExercisePage.proceedToCheckout.click();
        //12. Verify Address Details and Review Your Order
        Assert.assertTrue(automationExercisePage.addressDetails.isDisplayed());
        Assert.assertTrue(automationExercisePage.reviewYourOrder.isDisplayed());
        //13. Enter description in comment text area and click 'Place Order'
        automationExercisePage.commentCheckout.sendKeys(faker.address().fullAddress());
        automationExercisePage.placeOrder.click();
        //14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationExercisePage.nameOnCard.sendKeys(faker.name().fullName());
        automationExercisePage.cardNumber.sendKeys(faker.number().digits(12));
        automationExercisePage.cvc.sendKeys(faker.number().digits(3));
        automationExercisePage.expirationMonths.sendKeys("20");
        automationExercisePage.expirationYears.sendKeys("1994");
        automationExercisePage.payAndConfirmOrder.click();
        Thread.sleep(3000);
        Assert.assertTrue(automationExercisePage.yourOrderPlacedSuccessFully.isDisplayed());
        //15. Click 'Pay and Confirm Order' button
        //16. Verify success message 'Your order has been placed successfully!'
        //17. Click 'Delete Account' button









    }
}
