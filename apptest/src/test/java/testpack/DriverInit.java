package testpack;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

class DriverInit {

    private static AndroidDriver driver;

    private DriverInit(){

    }

    public static AndroidDriver getInstance() throws MalformedURLException {

        if(driver==null){

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "A2JDU16331009301");
            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0");
            capabilities.setCapability("appPackage", "com.thinkhome.v3");
            capabilities.setCapability("appActivity", "com.thinkhome.v3.launch.SplashActivity");
            //你想要等待启动的Activity名称
            capabilities.setCapability("appWaitActivity","com.thinkhome.v3.launch.SplashActivity");
            //每次启动时覆盖session，否则第二次后运行会报错不能新建session
            capabilities.setCapability("sessionOverride", true);

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        }

        return driver;
    }
}
