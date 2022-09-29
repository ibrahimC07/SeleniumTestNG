package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
    // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
    // 3. Açılır metni alın
    // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
    // 5. Açılır pencereyi kabul edin


    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.id("button1")).click();
        // 3. Açılır metni alın
        String alert = driver.switchTo().alert().getText();
        System.out.println(alert);
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedResult = "I am an alert box!";
        Assert.assertEquals(alert,expectedResult);
        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();


    }
}