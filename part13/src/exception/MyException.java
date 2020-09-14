package exception;
/*
内置异常不够用
有些领域相关的异常
异常类可以自己定义

自定义的方法：
    1.编写一个类继承exception 或 runtimeexception
    2.提供两个方法，一个无参数的一个带string参数的
 */

public class MyException extends Exception{//编译时异常
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}

/*
public class MyException extends RuntimeException{//运行时异常
}

 */