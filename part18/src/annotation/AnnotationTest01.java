package annotation;

/**
 * 注解annotation
 *
 * 是一种引用数据类型，编译之后也是生成xxx.class文件
 *
 * 自定义注解，语法格式
 *      [修饰词列表] @interface 注解类型名{
 *
 *      }
 *
 */
@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01() {
    }

    public static void m1(){
        @MyAnnotation
        int i=100;

    }
    public  void m2(@MyAnnotation
                    String name){

    }
}
