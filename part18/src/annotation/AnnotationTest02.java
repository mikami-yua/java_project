package annotation;

/**
 * override注解
 * 源代码
 * public @interface Override{
 * }
 *
 * @Override 是给编译器参考的，和运行阶段无关，凡是带有这个注解的编译器都会进行编译检查，如果不是重写父类的方法，编译器报错
 */
//@Override只能注解方法
public class AnnotationTest02 {

    @Override
    public String toString() {
        return super.toString();
    }
}
