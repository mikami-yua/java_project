package foreach;

/**
 * jdk5.0之后的新特性：增强for循环（foreach）
 *
 * 缺点：没有下标
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr={2536,237,456,423,23,123};
        //遍历数组：增强for
        /*
        for(元素类型 变量名：数组或集合){

        }
         */
        for(int data :arr){//data就是数组中的元素
            System.out.println(data);
        }
    }
}
