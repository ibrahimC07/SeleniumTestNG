package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        //fill the firstname
        //fill the lastname
        //check the gender
        //check the experience
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("(//*[@class='cookie-choices-button'])[2]")).click();
        WebElement firstName= driver.findElement(By.xpath("//*[@name='firstname']"));
        firstName.sendKeys("ibrahim");
        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("celik");
        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.id("exp-0")).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("22-09-2222");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();
        //choose your continent -> Antartica
        //dropdown methodu
        //        WebElement dropdownContinent =  driver.findElement(By.xpath("//select[@id='continents']"));
        //        Select select = new Select(dropdownContinent);
        //        select.selectByVisibleText("Antartica");

        driver.findElement(By.xpath("//*[@id='continents']")).sendKeys("Antartica");
        //choose your command  -> Browser Commands
        //1.way
        // driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();
        driver.findElement(By.xpath("//*[@id='selenium_commands']")).sendKeys("Brow");
        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();


    }
}
