package annotation;

/*
@Deprecated标注的元素已过时
 */
public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03.doSome();
    }

    @Deprecated
    public static void doSome(){
        System.out.println("do some");
    }

    public static void doOther(){
        System.out.println("do other");
    }
}
