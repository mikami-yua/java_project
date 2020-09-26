package annotation6;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        //获取类
        Class userClass = Class.forName("annotation6.User");
        //判断类上是否存在Id注解
        if(userClass.isAnnotationPresent(Id.class)){
            //要求类中必须有id属性
            //获取类的属性
            Field[] fields=userClass.getDeclaredFields();
            boolean flag=false;
            for (Field f:fields){
                if("id".equals(f.getName()) && "int".equals(f.getType().getSimpleName())){
                    //必须是int类型的id
                    flag=true;
                    break;
                }
            }

            if(!flag){
                throw new NotHasIdPropertyException("被Id注解标注的类中必须有一个int类型的id属性");
            }

        }
    }
}
