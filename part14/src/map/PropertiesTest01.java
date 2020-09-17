package map;

import java.util.Properties;

/**
 * 目前先掌握properties类的相关方法
 * Properties是个map集合，继承自hashtable，Properties的key和value都是String类型
 * Properties被称为属性类对象
 * Properties是线程安全的
 *
 * 需要掌握这两个方法
 *  存：
 *  取：
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建
        Properties pro=new Properties();
        //存
        pro.setProperty("username1","password1");
        pro.setProperty("username2","password2");
        pro.setProperty("username3","password3");
        pro.setProperty("username4","password4");
        pro.setProperty("username5","password5");

        //取


        String s1 = pro.getProperty("username1");
        String s2 = pro.getProperty("username2");
        String s3 = pro.getProperty("username3");
        String s4 = pro.getProperty("username4");
        String s5 = pro.getProperty("username5");

        //按住alt可以多行编辑
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);




    }
}
