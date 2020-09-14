package exception;

public class ExceptionTest09 {
    public static void main(String[] args) {
        /*
        try/finally
        执行顺序
            1.try。。。
            2.finally。。。
            3.return。。。return只有执行方法必然结束
         */
        try{
            System.out.println("try.");
            return;
        }finally {
            System.out.println("finally");//仍然会执行
        }
        //System.out.println("hello");//执行不到
    }
}
