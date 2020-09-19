package Review;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        //创建
        Properties pro=new Properties();
        //存
        pro.setProperty("username","zhangsan");
        //取
        String username=pro.getProperty("username");
        System.out.println(username);

    }
}
