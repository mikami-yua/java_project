package exception;

/**
 * 什么是异常
 *      程序执行过程中的不正常情况
 *
 * 异常机制的作用
 *      发生不正常的情况（除数是0）,java把异常信息打印到控制台，供开发者参考。让程序更加健壮
 *             java.lang.ArithmeticException: / by zero------------被称为异常信息，JVM打印的
 *
 *  Java中异常以什么形式存在的
 *      以类的形式存在
 *
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a=10,b=2,c;
        if (b==0){
            System.out.println("b = 0");
            return;
        }
        c=a/b;
        //b=0是 JVM会new一个ArithmeticException对象  信息“/ by zero”
        //JVM把异常抛出，打印在控制台
        System.out.println(c);

        //创建异常对象
        //通过异常类实例化异常对象
        NumberFormatException nfe=new NumberFormatException("数字格式化异常");
        System.out.println(nfe);//java.lang.NumberFormatException: 数字格式化异常

        NullPointerException npe=new NullPointerException("空指针发生了");
        System.out.println(npe);//java.lang.NullPointerException: 空指针发生了

    }
}
