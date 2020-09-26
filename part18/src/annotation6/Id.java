package annotation6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//表示注解只能出现在类上
@Retention(RetentionPolicy.RUNTIME)//可以被反射机制读取到
public @interface Id {

}
