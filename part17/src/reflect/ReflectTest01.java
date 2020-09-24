package reflect;

/**
 * 要操作一个类的字节码，首先要先获取到字节码。获得java.lang.class实例
 *      1.Class c=Class.forName("完整类名带包名");
 *      2.Class x=引用.getClass();
 *
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        //Class是个类名，小写是关键字
        /*
        Class.forName
            1.静态方法
            2.参数是字符串
            3.字符串需要一个完整类名

         */
        Class c1=null;
        try {
            c1=Class.forName("java.lang.String");//c1代表String.class文件，c1代表String类型
            Class c2=Class.forName("java.util.Date");
            Class c3=Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //java中任何一个对象都有一个方法:getClass()
        String s="abc";
        Class x=s.getClass();//x代表String.class文件，代表String类型
        System.out.println(c1==x);//true内存地址一样
        /*
        字节码文件装载到jvm的方法区，只装载1份
         */


        //方法3.java中任何一种类型，包括基本数据类型都有.class属性
        Class y=String.class;//y代表String.class文件，代表String类型

    }
}
