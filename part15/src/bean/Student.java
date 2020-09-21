package bean;

import java.io.Serializable;

public class Student implements Serializable {

    //手动写序列化版本号
    private static final long serialVersionUIN=512361762316712L;//jvm看到一致的类名才会检查这个值（可以随便写）

    private int no;
    private String name;

    //过来很久，Student这个类源代码改动了
    //源代码改动之后需要重新编译，生成了全新的字节码文件
    //并且class文件再次运行的时间，jvm生成的序列化版本号也会发生相应的改变
    private int age;

    public Student() {
    }

    public Student(int no, String name) {
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
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
