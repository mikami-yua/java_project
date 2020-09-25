package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射属性
 * 反射student类中所有的field
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        //1.获取整个类
        Class studentClass=Class.forName("bean.Student");
        //2.获取类中所有的field------public修饰的
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);//1
        //3.取出这个field
        Field f=fields[0];
        //取出这个field的名字
        System.out.println(f.getName());//no

        //获取所有的field
        Field[] fields1=studentClass.getDeclaredFields();
        System.out.println(fields1.length);//4
        //遍历
        for(Field fs:fields1){
            //获取属性的修饰符列表
            int i=fs.getModifiers();
            System.out.println(i);//返回的修饰符是个数字，每个数字是修饰符的代号
            //将代号数字转换为字符串
            System.out.println(Modifier.toString(i));
            //获取属性的类型
            Class fieldType=fs.getType();
            System.out.println(fieldType.getName());
            System.out.println(fieldType.getSimpleName());
            //获取名字
            System.out.println(fs.getName());
        }



    }
}
