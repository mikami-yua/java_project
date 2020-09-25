package reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IOPorpertiesTest {
    public static void main(String[] args) throws Exception{
        /*
        方法1
        String path=Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();

        FileReader reader=new FileReader(path);

         */
        /*
        方法2  直接以流的形式返回
         */
        InputStream reader=Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        Properties pro=new Properties();
        pro.load(reader);
        reader.close();

        //通过key获取value
        String className=pro.getProperty("className");
        System.out.println(className);


    }
}
