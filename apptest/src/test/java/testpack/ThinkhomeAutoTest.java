package testpack;

import java.net.MalformedURLException;

public class ThinkhomeAutoTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

//        try {
//            RegisterTest.main();
//            System.out.println("注册模块完成");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            LoginTest.main();
            System.out.println("登录模块完成");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
