package com.bj.javase.array.homework;

/**
 * 酒店中有二维数组，模拟大厦
 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        //一共几层，每层类型，编号是什么
        rooms = new Room[3][10];
        //创建30个room对象，放到rooms中
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                if (i==0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"单人间",true);
                }else if(i==1){
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"标准间",true);
                }else if (i==2){
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"总统套房",true);
                }
            }
        }

    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    //打印房间列表
    public void print(){
        for (int i=0;i<rooms.length;i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room=rooms[i][j];
                System.out.print(room.toString());
            }
            System.out.println();
        }

    }

    /**
     * 订房方法
     * @param roomNo
     */
    public void order(int roomNo){//207
        Room room=rooms[roomNo/100 -1][roomNo%100 -1];
        room.setStatus(false);
        System.out.println("已订房");
    }

    /**
     * 退房方法
     */
    public void exit(int roomNo){
        Room room=rooms[roomNo/100 -1][roomNo%100 -1];
        room.setStatus(true);
        System.out.println("已退房");
    }
}
