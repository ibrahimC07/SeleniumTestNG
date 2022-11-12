//package tests.US009;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.PearlyMarketPage;
//import utilities.Driver;
//import utilities.ReusableMethods;
//
//public class US_009_TC001 {
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
//        //Kullanici "Shipping" secenegine tiklar
//        ReusableMethods.jsclick(pmp.productShipping);
//        //Kullanici "weight"e gerekli bilgiyi girer
//        pmp.shippingWeight.sendKeys("0.1");
//        //Kullanici "Length"e gerekli bilgiyi girir
//        pmp.shippingLength.sendKeys("10");
//        //Kullanici "Width"e gerekli bilgiyi girer
//        pmp.shippingWidth.sendKeys("10");
//        //Kullanici "Height"e gerekli bilgiyi girer
//        pmp.shippingHeight.sendKeys("10");
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
