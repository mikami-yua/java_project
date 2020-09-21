package io;

import java.io.FileReader;
import java.util.Properties;

/**
 * IO & perporties的联合应用
 *
 * 非常好的一个设计理念：
 *      以后经常改变的数据可以写到文件中，使用程序动态读取，
 *      将来只需要修改文件的内容。不需要重新编译，服务器也不需要重启
 *
 *      类似于以上机制的文件，称为配置文件
 *          并且当配置文件中的内容是：
 *              key=value
 *              key=value
 *              key=value
 *              key=value
 *              key=value
 *          把这种配置文件称为属性配置文件
 *
 *      java规范中有要求，属性配置文件建议以.properties结尾，但这不是必须的
 *
 *      Porperties对象是专门存放属性配置文件内容的一个类
 *
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        //希望将userinfo中的数据加载到perporties对象当中

        //新建一个输入流对象
        FileReader reader=new FileReader("userinfo");

        //新建一个map集合
        Properties pro=new Properties();

        //调用Properties对象的load方法，将文件中的数据加载到map集合中
        pro.load(reader);//文件中的数据加载到map集合中，其中等号左的为key，右的为value

        //通过key获取value
        System.out.println(pro.getProperty("password"));//文件内容改变java程序不需要变


    }
}
