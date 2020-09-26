package reflect;

/**
 * 获得一个类的父类和接口
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{

        //string为例
        Class c=Class.forName("java.lang.String");

        //获取父类
        Class superClass=c.getSuperclass();
        System.out.println(superClass.getName());//java.lang.Object

        //获取实现的接口
        Class[] interfaces=c.getInterfaces();
        for (Class interf:interfaces){
            System.out.println(interf.getName());
        }
        /*
        java.io.Serializable
        java.lang.Comparable
        java.lang.CharSequence
        java.lang.constant.Constable
        java.lang.constant.ConstantDesc
         */
    }
}
