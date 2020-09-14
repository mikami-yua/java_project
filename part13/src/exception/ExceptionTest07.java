package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常对象的两个重要方法
 *      exception.getMessage();//获取异常的简单描述信息
 *      exception.printStackTrace();//打印异常追踪的堆栈信息-------一般开发用这个
 *
 * 查看异常信息怎么看
 *      从上往下看，SUN写的不用看，问题出现在自己编写的代码上（看包名可以看出是谁写的）
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        /*
        NullPointerException e=new NullPointerException("空指针异常");
        String msg=e.getMessage();//获取异常的简单描述信息:实际是构造方法上的参数
        System.out.println(msg);//空指针异常

        e.printStackTrace();

         */


        try {
            m1();
        } catch (FileNotFoundException ex) {
            //打印异常堆栈追踪信息
            //实际开发中建议使用这个
            ex.printStackTrace();
            /*
            java.io.FileNotFoundException: C:\迅雷下载\程序使说明.txt (系统找不到指定的文件。)
	            at java.io.FileInputStream.open0(Native Method)
	            at java.io.FileInputStream.open(FileInputStream.java:195)
	            at java.io.FileInputStream.<init>(FileInputStream.java:138)
	            at java.io.FileInputStream.<init>(FileInputStream.java:93)
	            上面是SUN写的不会错

	            下面是自己写的，从这里开始看，从上往下看----------41行是错误的根源
	            at exception.ExceptionTest07.m3(ExceptionTest07.java:41)  41行出问题导致37出问题
                at exception.ExceptionTest07.m2(ExceptionTest07.java:37)  37行出问题导致33出问题
                at exception.ExceptionTest07.m1(ExceptionTest07.java:33)
	            at exception.ExceptionTest07.main(ExceptionTest07.java:24)
             */
        }
        System.out.println("服务器不会因为异常宕机");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\迅雷下载\\程序使说明.txt");
    }
}
