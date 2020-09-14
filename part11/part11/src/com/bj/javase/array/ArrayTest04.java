package com.bj.javase.array;

/**
 * 模拟一个系统，系统使用必须输入用户名和密码
 */
public class ArrayTest04 {
    //用户名和密码输入到String[] args中
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("请输入用户名和密码");
            return ;
        }
        //运行至此说输入了用户名和密码
        String username=args[0];
        String passwd=args[1];

        //正确为 admin 123
        //if(username.equals("admin") && passwd.equals("123")){
        if("admin".equals(username) && "123".equals(passwd)){//这样编写避免空指针异常
            System.out.println("登录成功");
        }else{
            System.out.println("验证失败");
        }


    }
}
