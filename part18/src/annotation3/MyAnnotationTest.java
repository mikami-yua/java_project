package annotation3;

/**
 * 属性的名字是value时可以省略
 */
public class MyAnnotationTest {
    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    @MyAnnotation("haha")
    public void doOther(){

    }

}
