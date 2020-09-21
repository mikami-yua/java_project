package io;

/**
 * 参与序列化和反序列化的对象必须实现implements Serializable接口
 *      通过源代码发现implements Serializable只是标志接口，里面没有代码，起到标识的作用
 *      jvm看到这个类实现了这个接口，可能会有特殊待遇。jvm看到这个接口后会为该类，自动生成一个序列化版本号
 *
 *      序列化版本号作用：
 *      java.io.InvalidClassException://无效的类异常
 *          bean.Student;local class incompatible:
 *              stream classdesc serialVersionUID = -7109403299277628368,（类修改后）
 *              local class serialVersionUID = 507572570600860136（类修改前）
 *
 *      java语言中采用什么机制区分类的：
 *          1.通过类名进行比对
 *          2.如果类名一样，靠序列化版本号区分
 *
 *        有两个不同的开发者
 *          开发者1：编写了part15.src.bean.Student
 *          开发者2：编写了part15.src.bean.Student
 *
 *          不同的人编写了同一个类，但这两个类确实不是同一个类。这时候序列化版本号起作用。
 *          对于jvm来说是可以区分这两个类的，因为这两个类都实现了Serializable接口，都有默认的序列化版本号，他们发序列化版本号不一样。可以区分
 *          （好处）
 *
 *          缺陷：不能更新代码，只要修改必然会重新编译，此时会生成全新的序列化版本号，此时jvm认为这是一个全新的类
 *
 *
 *      【最终结论】：一个类如果实现了Serializable接口，建用给该类提供一个固定不变的序列化版本号，这样即使修改，版本号也不会变。
 *
 *
 */

import bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student s=new Student(11111,"zhangsan");
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("objectoutTEST_student"));
        //序列化对象
        oos.writeObject(s);//直接写报错，student类不支持序列化

        //刷新
        oos.flush();
        //关闭
        oos.close();
    }
}
