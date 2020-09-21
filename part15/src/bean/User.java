package bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 448134630686616851L;//IDEA自动生成的
    private int no;
    private String name;
    // transient 游离的，在序列化时可以不参与序列化
    private transient String sex;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
