package exception;

/**
 * 异常结构
 *      异常的继承结构
 *          可以用UML图表示
 *
 *      什么是UML图
 *          一种统一建模语言，一种图标式语言，面向对象的都有
 *          架构师和系统分析使用
 *          UML中可以描述类和类的关系，执行流程等
 *
 *      编译时异常和运行时异常
 *          【都发生在运行阶段】！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 *              因为只有运行阶段才能new对象
 *              异常的发生就是new异常对象
 *          编译时异常因为必须在编译阶段预先处理而得名，如果不处理编译器报错
 *
 *          编译时异常发生概率高
 *              看到下雨，想到不打伞会生病（生病是一种异常），拿伞就是一种处理异常的方式
 *
 *              对于发生概率高的异常，需要在编译时预处理
 *
 *          运行时异常发生概率低
 *              小明走着可能被轮子砸到（异常概率低）
 *                  没有必要处理这种异常
 *
 *
 *          编译时异常别名
 *              受检异常：CheckedException
 *              受控异常
 *
 *          运行时异常别名
 *               未受检异常：UnCheckedException
 *               未受控异常
 *
 *      异常处理的两种方式
 *          1.方法声明的位置上使用throws关键字，抛给上一级
 *              谁调用抛给谁，调用者同样需要处理。同样有两种处理方式
 *
 *          2.使用try。。。。。。catch语句进行捕捉
 *
 *
 *          异常如果一种上抛，main抛给JVM，JVM会终止执行
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        /**
         * 程序执行至此发生ArithmeticException异常
         * 底层new一个ArithmeticException异常对象
         * 然后抛出，由于main调用，所以抛给main
         * main没有处理，将异常自动抛给JVM。
         * JVM终止程序执行
         */
        System.out.println(100/0);
        /**
         * ArithmeticException继承RuntimeException属于运行时异常
         * 编写阶段不需要处理
         */


        System.out.println("helloworld！");
    }
}
