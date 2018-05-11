package testpack;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main() throws Exception {

        AndroidDriver driver = DriverInit.getInstance();

//        TouchAction action = new TouchAction(driver).press(75,100).moveTo(75,500);
//        action.perform().release();
//        action.perform().release();

        /*隐式等待，不然查找不到元素直接报错*/
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        /*账号为空*/
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("123456");
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例1：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*密码为空*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").clear();
            driver.findElement(By.id("com.thinkhome.v3:id/et_account")).sendKeys("18368493627");
            driver.hideKeyboard();
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例2：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*账号格式不正确*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_account").clear();
            driver.findElement(By.id("com.thinkhome.v3:id/et_account")).sendKeys("11");
            driver.hideKeyboard();
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("123456");
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例3：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*密码格式不正确*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").clear();
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("11");
            driver.findElementById("com.thinkhome.v3:id/et_account").clear();
            driver.findElement(By.id("com.thinkhome.v3:id/et_account")).sendKeys("18368493627");
            driver.hideKeyboard();
//        if(driver.isKeyboardShown()){
//            System.out.println("软键盘显示");
//            driver.hideKeyboard();
//        }
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例4：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*账号未注册*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").clear();
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("123456");
            driver.findElementById("com.thinkhome.v3:id/et_account").clear();
            driver.findElement(By.id("com.thinkhome.v3:id/et_account")).sendKeys("18698765432");
            driver.hideKeyboard();
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例5：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*账号密码不匹配*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").clear();
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("12345678");
            driver.findElementById("com.thinkhome.v3:id/et_account").clear();
            driver.findElement(By.id("com.thinkhome.v3:id/et_account")).sendKeys("18368493627");
            driver.hideKeyboard();
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElement(By.id("android:id/button3")).click();
            System.out.println("登录模块-用例6：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*输入正确的账号和密码*/
        Thread.sleep(100);
        try {
            driver.findElementById("com.thinkhome.v3:id/et_password").clear();
            driver.findElementById("com.thinkhome.v3:id/et_password").sendKeys("123456");
            driver.findElementById("com.thinkhome.v3:id/et_account").click();
            driver.hideKeyboard();
            driver.findElement(By.id("com.thinkhome.v3:id/btn_login")).click();
            driver.findElementByXPath("//android.widget.TextView[contains(@text,'测试账号')]").click();
            System.out.println("登录模块-用例7：通过");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}