package reflect;

import java.io.FileReader;

/**
 * 研究路径的问题
 *      获取文件的绝对路径
 */
public class AboutPath {
    public static void main(String[] args) throws Exception{
        /*
        FileReader reader=new FileReader("E:\\project\\part17\\classinfo.properties");
        缺点是移植性差
         */

        /*
        下面的代码即使代码换位置了也是通用的
        使用前提，这个文件必须在类路径下
        类路径：src下

        Thread.currentThread()当前线程对象
        getContextClassLoader() 线程对象的方法，可以获取当前线程的类加载器对象
        getResource（）             类加载器的方法，默认从类的根目录下获取资源
         */
        String path=Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        System.out.println(path);//绝对路径/E:/project/part13/out/production/part17/classinfo2.properties
        //程序在Linux上也可以使用


        /*
        获取bean下文件的绝对路径
         */
        String path2=Thread.currentThread().getContextClassLoader()
                .getResource("bean/db.properties").getPath();//从类的根路径作为起点开始
        System.out.println(path2);///E:/project/part13/out/production/part17/bean/db.properties
    }
}
