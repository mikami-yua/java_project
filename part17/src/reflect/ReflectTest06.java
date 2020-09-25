package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过反射机制反编译一个类的属性field
 *
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{

        //创建这个是为了拼接字符串
        StringBuilder s=new StringBuilder();

        //1.获取整个类
        Class studentClass=Class.forName("bean.Student");


        s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+" {\n");

        Field[] fields=studentClass.getDeclaredFields();
        for(Field fs:fields){
            s.append("\t");
            s.append(Modifier.toString(fs.getModifiers()));
            s.append(" ");
            s.append(fs.getType().getSimpleName());
            s.append(" ");
            s.append(fs.getName());
            s.append(";\n");
        }

        s.append("}");
        System.out.println(s);
        /*
        public class Student {
	    public int no;
	    private String name;
	    protected int age;
	     boolean sex;
}
         */
    }
}
