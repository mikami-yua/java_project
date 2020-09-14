package exception;
//final finally finalize有什么区别
public class ExceptionTest12 {
    public static void main(String[] args) {
        //final是个关键字，表示最终的不变的
        final int i=100;

        //finally和try联合使用，使用在异常处理机制中
        //finally语句块中的代码一定会执行
        try{

        } finally {
            System.out.println("finally...");
        }

        //finalize()是object类中的一个方法，作为方法名出现
        //finalize是标识符
       //gc负责调用
    }
}
