package reflect;

import java.lang.reflect.Method;

/**
 * 通过反射机制调用方法
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass=Class.forName("service.UserService");
        //创建对象
        Object obj=userServiceClass.newInstance();

        /*
        只依靠方法名不能确定方法（重载）
        通过参数名和列表区分方法
         */

        //获取所有的method(包括私有的)
        Method[] methods=userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);

        //获取login方法
        Method loginMethod=userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //调用方法
        /*
        调用方法的几个要素：
            1.对象
            2.方法名
            3.实参列表
            4.返回值
         */
        //反射机制中最最最重要的方法
        Object retValue= loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);

    }
}
