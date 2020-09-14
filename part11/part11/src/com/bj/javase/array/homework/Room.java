package com.bj.javase.array.homework;

import java.util.Objects;

/**
 * 房间
 */
public class Room {
    private int no;
    private String type;
    private boolean status;//ture 表示可以预定

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals重写

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no;//房间编号相同就认为同一个房间
    }

    //tostring重写

    @Override
    public String toString() {
        //return "[101,单人间，占用]";
        return "["+no+","+type+","+(status ? "空闲":"占用")+"]";
    }
}
