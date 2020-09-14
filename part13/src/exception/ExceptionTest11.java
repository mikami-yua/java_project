package exception;



public class ExceptionTest11 {
    public static void main(String[] args) {
        System.out.println(m());//结果:100
    }

    /*
    java语法规则
        方法体中的代码必须遵循自上而下的顺序依次执行
        return一旦执行方法就结束
     */
    public static int m(){
        int i=100;
        try{
            return i;//执行到return时，会先找finally，执行完后再返回，但return执行的结果已经记录了，只是暂停
        }finally {
            i++;
        }
    }
}
