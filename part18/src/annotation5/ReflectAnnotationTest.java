package annotation5;

/**
 * 反射注解
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c=Class.forName("annotation5.MyAnnotationTest");
        //判断类上是否有注解
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));//true
        //如果有注解获取注解对象
        if(c.isAnnotationPresent(MyAnnotation.class)){
            //获取注解对象
            MyAnnotation myAnnotation=(MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上的注解对象"+myAnnotation);//类上的注解对象@annotation5.MyAnnotation()
            //获取注解的属性，和调接口差不多
            String value=myAnnotation.value();
            System.out.println(value);
        }
    }


}
