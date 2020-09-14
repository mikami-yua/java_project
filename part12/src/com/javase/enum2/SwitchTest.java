package com.javase.enum2;

public class SwitchTest {
    public static void main(String[] args) {

        //switch支持枚举，string，int
        switch (Color.BLACK){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;

        }
    }
}
