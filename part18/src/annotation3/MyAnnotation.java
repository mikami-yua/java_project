package annotation3;

public @interface MyAnnotation {
    String value();
    //String email();属性只有一个，且是value时才能省略
}
