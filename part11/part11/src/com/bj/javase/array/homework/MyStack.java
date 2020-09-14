package com.bj.javase.array.homework;

public class MyStack {
    //向栈中存储元素，用一维数组模拟
    //object类型可以存储java中任意引用数据类型
    private Object[] elements;

    //栈帧，永远指向栈顶,注意栈初始是空的
    //private int index=0;//栈帧指向顶部元素的上方
    private int index=-1;//栈帧指向顶部元素

    /**
     * 压栈方法
     * @param obj
     */
    public void push(Object obj){
        if(this.index >= this.elements.length-1){//栈已满
            System.out.println("stackoverflow");
            return;
        }
        this.index++;
        this.elements[index]=obj;
        System.out.println("push stack success! "+obj+"  index ------>"+ index);
    }

    /**
     * 弹栈
     * @return
     */
    public Object pop(){
        if(index < 0){
            System.out.println("stack if empyt");
            return null;
        }
        System.out.println("pop stack success! "+elements[index]+"  index ------>"+ index--);
        return elements[index];
    }



    //假设栈的默认初始化容量是10，无参构造需要注意
    public MyStack() {
        this.elements=new Object[10];
    }

    //set get
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }


}
