package com.itheima.reflections;

import com.itheima.domain.Person;

import java.lang.reflect.Method;

public class ReflectMethods {
    public static void main(String[] args) throws Exception{
//        Class c= Person.class;
//        Method eat_method=c.getMethod("eat");
//        Person p=new Person();
//        eat_method.invoke(p);

        // with Parameters

        Class p=Person.class;
        Method eat_m=p.getMethod("eat",String.class);
        Person person=new Person("Lida",21);
        eat_m.invoke(person," rice");
    }
}
