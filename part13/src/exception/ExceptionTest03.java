package exception;

public class ExceptionTest03 {
    /*处理方法1.继续上抛
    public static void main(String[] args) throws ClassNotFoundException {
        //main方法调用dosome
        //因为dosome有throws ClassNotFoundException
        //在调用dosome时，必须对这种异常进行预处理，否在编译器会报错
        //doSome();报错
        doSome();
    }

     */

    //处理方式2.try。。。catch捕捉
    public static void main(String[] args) {
        try {
            doSome();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * dosome方法在声明处使用throws ClassNotFoundException
     * 表示dosome执行过程中可能出现ClassNotFoundException异常（类没找到异常）
     * ClassNotFoundException直接父类是Exception，故属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{//throws后写一个exception类的子类
        System.out.println("dosome");
    }
}
