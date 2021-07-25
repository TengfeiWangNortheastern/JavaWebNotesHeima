package com.itheima.annotation;
/*- @override : from father class?
- @Deprecated : outdated
- @SuppressWarnings : warning 不显示警告*/
@SuppressWarnings("all")
public class AnnoDemo2 {
    @Override
    public String toString(){
        System.out.println("to string");
        return "";
    }

    @Deprecated
    public void show1(){
        //weakness
    }

    public void show2(){
        // replace show1()

    }
    @MyAnnotation(age=12,per = Person.p1,anno2 = @MyAnno2,strs = {"this","is"})
    public void demo(){
        show1();
    }
}
