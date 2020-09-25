package reflect;

/**
 * 获取到class有什么用
 *
 *
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        //通过反射机制，获取class，通过class实例化对象
        try {
            Class c=Class.forName("bean.User");

            //newInstance()会调用无参数构造方法完成构造，必须保证无参数构造的存在【重点】
            //当有有参数的构造方法时，系统自动生产的无参构造不起作用，会出现异常
            Object obj=c.newInstance();

            System.out.println(obj);//bean.User@b4c966a
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
