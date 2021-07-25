package com.itheima.reflections;

import com.itheima.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
        Class c1=Class.forName("com.itheima.domain.Person");
        System.out.println(c1);

        System.out.println(Person.class);

        Person p=new Person("Jim",12);
        System.out.println(p.getClass());
        System.out.println("three equal each other");

        Object o=c1.getField("name1");
        System.out.println(o);

        Person p1=new Person("coo",12);
        p.setName("like");
        System.out.println(p);
        System.out.println("declared fields---");
        for (Field d: c1.getDeclaredFields()){
            System.out.println(d);
        }
        for (Field d: c1.getFields()){
            d.setAccessible(true);
            System.out.println(d.getName());
        }

    }
}
