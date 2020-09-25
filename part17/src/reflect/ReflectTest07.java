package reflect;

import java.lang.reflect.Field;

/**【重要】
 *通过反射机制访问对象的属性
 *      给属性赋值
 *      获取属性的值
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        Class studentClass=Class.forName("bean.Student");
        Object obj=studentClass.newInstance();

        //获取no属性(根据属性的名称获取field)
        Field noField=studentClass.getDeclaredField("no");
        //给obj对象的no属性赋值
        noField.set(obj,22222);
        /*
        赋值三要素
        1.obj对象
        2.nofield属性
        3.22222值
        反射机制的代码负责了，但是很灵活
         */
        //读取属性的值
        System.out.println(noField.get(obj));
        /*
        获取属性的值两个要素
        1.nofield属性
        2.obj对象
         */

        //访问私有属性
//        Field nameField=studentClass.getDeclaredField("name");
//        nameField.set(obj,"jack");
//        System.out.println(nameField.get(obj));//私有属性不能访问

        //打破封装

        Field nameField=studentClass.getDeclaredField("name");
        nameField.setAccessible(true);//反射机制的缺点，容易打破封装。
        nameField.set(obj,"jack");
        System.out.println(nameField.get(obj));
    }
}
