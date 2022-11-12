//package tests.US010;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.PearlyMarketPage;
//import utilities.Driver;
//import utilities.ReusableMethods;
//
//import java.util.List;
//
//public class US_010_TC_002 {
//    PearlyMarketPage pmp = new PearlyMarketPage();
//    Actions actions = new Actions(Driver.getDriver());
//
//
//    @Test
//    public void test01() {
//        //Kullanici ilgili URL'e gider
//        ReusableMethods.addNewProduct();
//        // Kullanici "Simple Product" Butonunu secer
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Select select = new Select(pmp.addProductSimpleProduct);
//        select.selectByVisibleText("Simple Product");
//        /*
//        Dogrulamayi asagidaki gibi yapabilirsin
//        String actualResult="Simple Product";
//        String expectedResult=select.getFirstSelectedOption().getText();
//        Assert.assertEquals(actualResult,expectedResult);
//         */
//        //Kullanici "product title"'a urunun basligini girer
//        pmp.addProductProductTitle.sendKeys("T-shirt");
//        // Kullanici buyuk resim ekranina urun resimini ekler
//        pmp.buyukResimEkleme.click();
//        WebElement dosyaSec = pmp.buyukResimEklemeSelectFiles;
//        String dosyaYolu = "C:\\Users\\KADİR\\Desktop\\x5_1027363068w0t.jpg";
//        dosyaSec.sendKeys(dosyaYolu);
//        pmp.buyukResimMediaLibrary.click();
//        ReusableMethods.waitFor(1);
//        pmp.buyukResimEklemeOrnekResim.click();
//        ReusableMethods.waitFor(1);
//        pmp.buyukResimEklemeMediaLibrarySelectButton.click();
//        //Kullanici kucuk resim ekranina bir urun resmi daha ekler
//        pmp.kucukResimEkleme.click();
//        ReusableMethods.waitFor(1);
//        pmp.kucukResimEklemeOrnekResim.click();
//        ReusableMethods.waitForClickablility(pmp.kucukResimAddToGalery, 5).click();
//        // Kullanıcı ürünün "CATEGORİES" seçimni yapmalıdır.
//        ReusableMethods.waitForClickablility(pmp.productCotegory, 5).click();
//        //Kullanici "Attiributes" secenegine tiklar
//        ReusableMethods.jsclick(pmp.productAttributes);
//        //Kullanici"color" kutucuguna tiklar
//        pmp.attributesColorCheckBox.click();
//        //Kullanici acilan bolumde "select all" yazisina tiklar
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[.='Select all'])[1]")));
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
//        //Kullanici dropdown bolumun dolduruldugunu test eder
//        List<WebElement> actualResult = pmp.attributesColorList;
//        Assert.assertTrue(actualResult.size() > 0);
//        //kullanici size kutucuguna tiklar
//        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
//        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#attributes_is_active_2")));
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element1);
//        //Kullanici acilan bolumde size kutucuguna small, medium, large, extra large seceneklerini secebilmeli
//        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
//        WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[2]")));
//        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element2);
//        //kutucugun dolu oldugu dogrulanir
//        List<WebElement> actualResult1 = pmp.attributeSizeList;
//        Assert.assertTrue(actualResult1.size() > 0);
//        // Kullanici "Submit" butonuna basar
//        ReusableMethods.jsclick(pmp.productSubmitButton);
//        //Urunun guncellendigi dogrulanir
//        Assert.assertTrue(ReusableMethods.waitForVisibility(pmp.productPublishedText,15).isDisplayed());
//        //sayfayi kapat
//        Driver.closeDriver();
//
//
//
//
//    }
//}
