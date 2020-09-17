package map;

import java.util.TreeSet;

/**
 * 先按照年龄升序，年龄一样的再按照姓名升序
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Vip> vips=new TreeSet<>();
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("djasijd",20));
        vips.add(new Vip("dhasdf",23));
        vips.add(new Vip("zqweq",29));
        vips.add(new Vip("oifjso",45));
        vips.add(new Vip("asadf",19));

        for(Vip v:vips){
            System.out.println(v);
            /*
            Vip{name='asadf', age=19}
            Vip{name='djasijd', age=20}
            Vip{name='zhangsan', age=20}
            Vip{name='dhasdf', age=23}
            Vip{name='zqweq', age=29}
            Vip{name='oifjso', age=45}
             */
        }

    }
}

class Vip implements Comparable<Vip>{
    private String name;
    private int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 先按照年龄升序，年龄一样的再按照姓名升序
     * @param v
     * @return 返回0，value会被覆盖
     *          >0 继续在右子树上找
     *          <0.......左子树。。。
     */
    @Override
    public int compareTo(Vip v) {
        if(this.age==v.age){
            //string类已经实现了compareto方法
            return this.name.compareTo(v.name);
        }else{
            return this.age-v.age;
        }

    }
}
