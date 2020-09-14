package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            //创建流
            FileInputStream fis = new FileInputStream("E:\\javase\\not\\学习方法.txt");

            //进行数学运算
            System.out.println(100/0);
        }catch (FileNotFoundException | ArithmeticException e) {//JDK8的新特性
            System.out.println("文件不存在？数学异常");
        }
    }
}
