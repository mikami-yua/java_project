package exception;
//p180

/**
 * 重写之后的方法不能比重写之前的抛出更多的异常，可以更少（更精确）-----运行时异常
 */
class Animal{
    public void doSome(){

    }

    public void doOther() throws Exception{

    }
}

class Cat extends Animal{

    public void doSome() throws RuntimeException{//正常

    }

    /**报错
    @Override
    public void doSome() throws Exception{
        super.doSome();
    }
    */
    /*
    public void doOther() {//正常

    }

     */
    /*正常
    public void doOther() throws Exception{

    }

     */
    public void doOther() throws NullPointerException{//正常

    }
}
/**
 异常中的关键字

 异常补捉
 try
 catch
 finally


 throws 在方法声明的位置使用，表示上报信息给调用者
 throw  手动抛异常
 */