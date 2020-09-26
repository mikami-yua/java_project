package annotation4;

public class OtherAnnotationTest {

    //数组是大括号
    @OtherAnnotation(age=25,email = {"zhangsan","123456"})
    public void doSome(){

    }

    //数组只有一个元素可以省略大括号
    @OtherAnnotation(age=26,email = "zhangsan")
    public void doOther(){

    }
}
