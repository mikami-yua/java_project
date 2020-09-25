package bean;

/**
 *反射属性Field
 * Field---字段（翻译）
 *      属性，成员
 */
public class Student {
    //四个filed，分别采用不同的访问控制权限修饰符（最后一个是默认）
    public int no;//从public到no 整个这三个词是一个field对象
    private String name;
    protected int age;
    boolean sex;
}
