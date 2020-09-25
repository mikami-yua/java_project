package reflect;

import java.util.ResourceBundle;

/**
 * java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
 *
 * 这种方式，属性配置文件必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器，只能绑定xxxxx.properties文件，且文件必须在类路劲下。文件扩展名也必须是.properties
        //并且不写扩展名，只写文件名
        ResourceBundle bundle=ResourceBundle.getBundle("classinfo2");//不需要后缀

        String className=bundle.getString("className");
        System.out.println(className);

        ResourceBundle bundle2=ResourceBundle.getBundle("bean/db");
        className=bundle2.getString("className");
        System.out.println(className);


    }
}
