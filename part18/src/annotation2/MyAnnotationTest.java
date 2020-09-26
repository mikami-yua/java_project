package annotation2;

public class MyAnnotationTest {

    //@MyAnnotation()报错原因如果一个注释中有属性，必须给属性赋值
    @MyAnnotation(name = "zhangsan",color = "红色")
    public void doSome(){

    }
}
