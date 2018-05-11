package testpack;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class RegisterTest {

    public static void main() throws Exception {

        AndroidDriver driver = DriverInit.getInstance();

        /*账号为空*/
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*密码为空*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").clear();
        driver.findElementById("com.thinkhome.v3:id/register_password").clear();
        driver.findElementById("com.thinkhome.v3:id/register_verify").clear();
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("18368493627");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*确认密码为空*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").clear();
        driver.findElementById("com.thinkhome.v3:id/register_password").clear();
        driver.findElementById("com.thinkhome.v3:id/register_verify").clear();
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("18368493627");
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*账号格式不正确*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").clear();
        driver.findElementById("com.thinkhome.v3:id/register_password").clear();
        driver.findElementById("com.thinkhome.v3:id/register_verify").clear();
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("11");
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*密码格式不正确*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").clear();
        driver.findElementById("com.thinkhome.v3:id/register_password").clear();
        driver.findElementById("com.thinkhome.v3:id/register_verify").clear();
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("18368493627");
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("1");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*确认密码格式不正确*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("18368493627");
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("1");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();

        /*账号已注册*/
        driver.findElementById("com.thinkhome.v3:id/register_phonenum").sendKeys("18368493627");
        driver.findElementById("com.thinkhome.v3:id/register_password").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_verify").sendKeys("123456");
        driver.findElementById("com.thinkhome.v3:id/register_btn").click();
        driver.findElement(By.id("android:id/button3")).click();
    }
}
