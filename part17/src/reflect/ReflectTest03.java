package reflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * 验证反射机制的灵活性
 *      Java代码写一遍，在不改变源代码的基础上，可以做到对不同对象的实例化（符合OCP开闭原则：对扩展开放，对修改关闭）
 *      创建的对象取决于配置文件中的类名
 *
 * 高级框架的底层是反射机制
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        //通过IO读取class.info.properties文件
        //E:\project\part17
        FileReader reader=new FileReader("E:\\project\\part17\\classinfo.properties");
        //创建属性类对象MAP
        Properties pro=new Properties();//key value都是string
        //加载
        pro.load(reader);
        //已经把文件加载到了map集合中，可以关闭流了
        reader.close();

        //通过key获取value
        String className=pro.getProperty("className");
        System.out.println(className);

        //通过反射机制实例化对象
        Class c=Class.forName(className);
        Object obj=c.newInstance();
        System.out.println(obj);
        /*
        通过对classinfo.properties的类名修改，可以在不改动代码的情况先创造出不同的对象
         */
    }
}
