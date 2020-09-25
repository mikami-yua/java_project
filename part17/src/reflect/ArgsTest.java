package reflect;

/**
 * 可变长参数
 *      int... args类型后三个.
 *      要求参数个数是0-n个
 *      可变长参数只能出现在参数列表的最后一个（只能有1个）
 *      可变长度参数可以当作一个数组来看待
 *
 *
 */
public class ArgsTest {
    public static void main(String[] args) {
        m1();
        m1(10);
        m1(10,20);
        m2(10);
        m2(10,20,30);
        m3(10,20,30,40,50,60,70,80,90);
        int[] arr={10,20,30,40,50,60,70,80,90};
        m3(arr);
    }

    public static void m1(int... args){
        System.out.println("m1 method running");
    }
    public static void m2(int a,int... args){
        System.out.println("m2 method running");
    }
    public static void m3(int... args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
