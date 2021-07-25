package com.itheima.annotation;

public @interface MyAnnotation {
    int age();
    String name() default "台风";
//    String show2();
    Person per();
//
    MyAnno2 anno2();
//
    String[] strs();
}
