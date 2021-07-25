package com.itheima.domain;

public class Person {
    private String name;
    private int age;
    public String name1;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age='" + age + '\'' +
                '}';
    }
}
