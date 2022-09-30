package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //Amazon sayfasına ve facebook sayfasına gidiniz
        String urlamzn = ConfigReader.getProperty("amazonUrl");
        String urlFace = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();

    }
}
