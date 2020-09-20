package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.File类和流的四大家族没有关系，不能完成文件的读和写
 * 2.File类代表：文件和目录路径名的抽象表示形式
 *      一个file对象可能是目录，也可能是文件，file只是路径名从抽象表示形式
 * 3.File类中常用的方法
 *
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个file对象
        File f1=new File("E:\\fileTest");//当前不存在

        //判断是否存在
        System.out.println(f1.exists());//false

        //如果不存在，则以文件的形式创建出来
//        if(!f1.exists()){
//            f1.createNewFile();
//        }

        //如果不存在，则以目录的形式创建出来
//        if(!f1.exists()){
//            f1.mkdir();
//        }

        //创建多重目录
        File f2=new File("E:\\fileTest\\a\\b\\c\\d\\e\\f");
//        if(!f2.exists()){
//            f2.mkdirs();
//        }

        File f3=new File("E:\\vpn\\VULTR.txt");
        //获取该文件的父路径
        String parentPath=f3.getParent();
        System.out.println(parentPath);
        File parentFile=f3.getParentFile();
        System.out.println(parentFile.getAbsolutePath());//绝对路径

        File f4=new File("copytest");
        System.out.println(f4.getAbsolutePath());

        System.out.println(f3.getName());//获取文件名

        //判断是否是个目录
        System.out.println(f3.isDirectory());
        //判断是否是个文件
        System.out.println(f3.isFile());

        File f5=new File("logfileTEST");
        //获取文件最后一次修改时间
        Long hapmiao=f5.lastModified();//返回毫秒 1970到现在的总毫秒数
        //将总毫秒数转换为日期
        Date time=new Date(hapmiao);
        SimpleDateFormat sdf=new SimpleDateFormat();
        String strT=sdf.format(time);
        System.out.println(strT);//2020/9/20 下午4:32

        //获取文件大小
        System.out.println(f5.length());//132字节

        //listfiles方法-------返回值File[] listFiles();
        //获取当前目录下的所有子目录
        File f6=new File("E:\\vpn");
        File[] files= f6.listFiles();
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }
        /*
        E:\vpn\DigitalOcean+Shadowsocks VPS搭建 _ Mac端+iOS端全自动科学上网.pdf
        E:\vpn\edu.txt
        E:\vpn\gui-config.json
        E:\vpn\jia-10.txt
        E:\vpn\PuTTY_0.67.0.0.exe
        E:\vpn\s.zip
        E:\vpn\Shadowsocks-4.0.10.zip
        E:\vpn\ShadowsocksR-dotnet4.0.exe
        E:\vpn\ShadowsocksR-win-4.9.0.zip
        E:\vpn\ssr-canda.txt
        E:\vpn\ssr-indan.txt
        E:\vpn\transfer_log.json
        E:\vpn\VULTR.txt
        E:\vpn\服务器.txt
        E:\vpn\步骤.txt
        E:\vpn\第3代.rar
        E:\vpn\ShadowsocksR-win-4.9.0
        E:\vpn\temp
        E:\vpn\第3代
         */
    }
}
