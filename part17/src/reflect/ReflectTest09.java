package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
反编译一个类的构造方法
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        Class vipClass=Class.forName("bean.Vip");

        Constructor[] constructors=vipClass.getDeclaredConstructors();
        for(Constructor con:constructors){
            System.out.println(Modifier.toString(con.getModifiers()));
            System.out.println(vipClass.getSimpleName());
            //得到参数
            Class[] parameterTypes=con.getParameterTypes();
            for(Class para:parameterTypes){
                System.out.print(para+" ");
            }
        }




        /*
        通过反射机制创建对象
         */
        //调用无参数的构造方法
        Object obj1= vipClass.newInstance();
        //调用有参数的构造方法
        //1.先获取构造方法
        Constructor con1=vipClass.getDeclaredConstructor(int.class,String.class);
        Constructor con2=vipClass.getDeclaredConstructor(int.class);
        //2.调用new方法创建对象
        Object obj2=con1.newInstance(1,"zhangsan");
        Object obj3=con2.newInstance(2);

        System.out.println(obj1);//Vip{no=0, name='null', birth='null', sex=false}
        System.out.println(obj2);//Vip{no=1, name='zhangsan', birth='null', sex=false}
        System.out.println(obj3);//Vip{no=2, name='null', birth='null', sex=false}

    }
}
