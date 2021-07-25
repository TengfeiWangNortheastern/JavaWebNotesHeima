package com.itheima.annotation;

@Pro(className = "com.itheima.annotation.showDemo",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        /*
        * 1. analyze annotation
        *   1.1 get byte doc object\
        * 2. get annotation object
        * 3. implement abstract method in annotation , get return value
        * */
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        Pro an=reflectTestClass.getAnnotation(Pro.class); // generate a child of the annotation in memory
        System.out.println(an==null);
        //获取抽象方法
        String className=an.className();
        String methodName=an.methodName();
        System.out.println(className+" "+methodName);

        //加载该类进内存
    }
}
