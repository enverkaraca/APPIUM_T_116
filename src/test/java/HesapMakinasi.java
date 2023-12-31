import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HesapMakinasi {

    AndroidDriver<AndroidElement> driver;
// Android isletim sistemine sahip olan cihazlarda daha dogru sonucu vererek
// veya yaptigimiz islemlere dogru komutlarin verilmesini saglar
// ve sadece Android cihazlarda kullanilir
// Android olmayan cihazlarda kesin calismaz anlamina gelmez, ama yanlislik orani daha yuksek oluur


    AppiumDriver<MobileElement> driver2; // Hem Android hem Ios isletim sistemine
    // sahip olan cihazlar icin kullanilir
// Android driver icin ayri bir driver oldugundan dolayi,
// Appium driver Ios ve turevleri icin kullanilmaktadir.

    @Test
    public void hesapMakinasi(){

        DesiredCapabilities capabilities= new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"10.0");

    }
}
