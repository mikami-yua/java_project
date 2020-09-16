package collection;

/**
 * 自定义泛型
 *
 * java源代码中经常出现的是<E><T>
 *     <E>是element首字母
 *     <T>是Type首字母
 */
public class GenericTest03<标识符随便写> {
    public void doSome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt=new GenericTest03<>();
        gt.doSome("123");//gt.doSome();形参只能放string

        GenericTest03<Integer> gt2=new GenericTest03<>();
        gt2.doSome(123);


        MyIterator<String> m1=new MyIterator<>();
        String s1=m1.get();

        MyIterator<Animal> m2=new MyIterator<>();
        Animal a=m2.get();

        //定义了泛型不使用会默认采用object
//        MyIterator m3=new MyIterator();
//        m3.get(new Object());
    }
}

//泛型一般写为E或T
class MyIterator<T> {
    public T get(){
        return null;
    }
}