package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用定时器指定定时任务
 */
public class TimerTest {
    public static void main(String[] args) throws Exception{
        //创建定时器对象
        Timer timer=new Timer();
        //Timer timer=new Timer(true);守护线程的方式

        //指定定时任务
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date f_time=sdf.parse("2020-09-23 20:22:50 000");

        timer.schedule(new LogTimerTask(),f_time,1000*10);

        /*
        2020-09-23 20:22:50 013完成一次数据备份
        2020-09-23 20:23:00 035完成一次数据备份
        2020-09-23 20:23:10 032完成一次数据备份
        2020-09-23 20:23:20 035完成一次数据备份
        2020-09-23 20:23:30 080完成一次数据备份
         */
    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        //在这里编写需要执行的任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime=sdf.format(new Date());
        System.out.println(strTime+"完成一次数据备份");
    }
}