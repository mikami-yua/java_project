package homework;

import java.io.*;

/**
 * 拷贝目录
 */
public class CopyAll {
    //C:\吉林大学软件学硕979\吉林大学计算机软件真题补充版
    public static void main(String[] args) {
        //拷贝源
        File srcFile=new File("C:\\吉林大学软件学硕979\\吉林大学计算机软件真题补充版");
        //拷贝目标
        File targetFile=new File("E:\\a\\b");//拷贝到E
        //拷贝方法
        copyDir(srcFile,targetFile);
    }

    /**
     * 拷贝目录方法
     * @param srcFile       拷贝源
     * @param targetFile    拷贝目标
     */
    private static void copyDir(File srcFile, File targetFile) {
        //递归出口
        if(srcFile.isFile()){
            //是文件的时候需要拷贝
            //边读边写
            FileInputStream in=null;
            FileOutputStream out=null;
            try {
                //读这个文件
                in=new FileInputStream(srcFile);
                //写到这个文件中
                String path=(targetFile.getAbsolutePath().endsWith("\\")? targetFile.getAbsolutePath():targetFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3);
                out=new FileOutputStream(path);
                //一边读一边写
                byte[] bytes=new byte[1024*1024];//一次复制1M
                int readCound=0;
                while ((readCound=in.read(bytes))!=-1){
                    out.write(bytes,0,readCound);
                }

                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }

        //获取源下的子目录
        File[] files= srcFile.listFiles();
        for(File file:files){
            //这个file可能是文件也可能是目录
            System.out.println(file.getAbsolutePath());//获取所有文件的绝对路径

            //是目录的话需要新建目录
            if(file.isDirectory()){
                //src:C:\吉林大学软件学硕979\吉林大学计算机软件真题补充版\计算机专硕966
                //tatget:E:\吉林大学软件学硕979\吉林大学计算机软件真题补充版\计算机专硕966
                String srcDir=file.getAbsolutePath();
                //目标目录截取盘符后，加到目标后面.从下标为3开始截
                System.out.println(srcDir.substring(3));


                String targetDir=(targetFile.getAbsolutePath().endsWith("\\")? targetFile.getAbsolutePath():targetFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                System.out.println(targetDir);
                File newfile=new File(targetDir);
                if (!(newfile.exists())) {
                    newfile.mkdirs();
                }
            }

            //递归调用
            copyDir(file,targetFile);
        }

    }
}
