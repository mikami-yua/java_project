package annotation2;

public @interface MyAnnotation {
    /**
     * 通常在注解中可以定义属性，下面是name属性
     * 看着像方法，其实是属性
      * @return
     */
    String name();

    String color();

    int age() default 25;//属性指定默认值
}
