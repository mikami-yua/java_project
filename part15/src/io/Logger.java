package io;

import java.awt.desktop.SystemSleepEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 */
public class Logger {
    public static void log(String msg){
        try {
            //标准输出流指向日志文件
            PrintStream out=new PrintStream(new FileOutputStream("logfileTEST",true));
            //改变输出方向
            System.setOut(out);
            //日期当前时间
            Date nowTime=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//日期格式
            String strTime=sdf.format(nowTime);

            System.out.println(strTime+": "+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
