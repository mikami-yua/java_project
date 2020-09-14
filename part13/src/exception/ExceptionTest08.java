package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try。。。catch中的finally语句
 *      -finally子句中的代码最后执行，且一定会执行，即使try/catch出现异常
 *      -通常用在那些情况下
 *          在finally中完成资源的释放/关闭
 *          finally中的代码一定会正常执行
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        FileInputStream fis=null;//声明放在try外，fis在try中定义，finally中用不了，出作用域了
        try {
            //创建输入流
            fis=new FileInputStream("C:\\迅雷下载\\程序使用说明.txt");
            String s=null;
            //这里一定会出现空指针异常
            s.toString();

            //流使用完需要关闭，因为流占用资源
            //fis.close();//出现异常，流不会关闭
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            //fis.close();//close报错-----可能没有new成
            if (fis !=null){
                try {
                    //close有异常采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
