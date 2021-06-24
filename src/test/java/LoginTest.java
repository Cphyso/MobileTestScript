import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    static RemoteWebDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        accessCalculator();
        Thread.sleep(3000);
        LoginTest();
    }
    public static void accessCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","HUAWEI Y5 lite");
        cap.setCapability("udid","MQK9K19C23900464");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","8.1.0");
        cap.setCapability("appPackage","com.dinersclub.sa");
        cap.setCapability("appActivity","MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new RemoteWebDriver(url, cap);
        System.out.println("devices has started!!!!");
        System.out.println("diners club mobile app is activated!");
    }

    public static void LoginTest() throws InterruptedException {
        WebElement signIn =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
        signIn.click();
      /*  Thread.sleep(10000);
        Wait wait = new WebDriverWait(driver,20);

        WebElement email = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.click();
        email.sendKeys("sifiso.mhlongo@standardbank.co.za");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div[48]"));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.click();
        password.sendKeys("Njomane>3969");*/
    }
}
