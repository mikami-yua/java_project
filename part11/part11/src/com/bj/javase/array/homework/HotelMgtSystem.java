package com.bj.javase.array.homework;

import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
        //创建酒店对象
        Hotel hotel = new Hotel();


        //欢迎页面
        System.out.println("hello");
        System.out.println("1.【查看房间列表】  2.【订房】   3.【退房】   0.【退出】");
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("请输入功能编号");
            int i=s.nextInt();
            if (i==1){
                hotel.print();
            }else if (i==2){
                System.out.println("请输入房间编号");
                int roomNo=s.nextInt();
                hotel.order(roomNo);
            }else if (i==3){
                System.out.println("请输入房间编号");
                int roomNo=s.nextInt();
                hotel.exit(roomNo);
            }else if (i==0){
                System.out.println("bye");
                return;
            }else{
                System.out.println("数字不正确");
            }
        }

    }
}


