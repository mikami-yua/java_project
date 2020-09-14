package exception;

public class ExceptionTest10 {
    public static void main(String[] args) {
        try{
            System.out.println("try.");
            System.exit(0);//退出jvm虚拟机，finally不执行了
        }finally {
            System.out.println("finally");//不会执行
        }
    }
}
