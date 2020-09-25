package reflect;

/**
 * 研究class.forname发生了什么
 *      会导致类加载
 *      只希望类的静态代码块执行可以使用Class.forName
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class MyClass{
    //静态代码块在加载时执行，且只执行1次
    static{
        System.out.println("myclass's static block is run !");

    }
}