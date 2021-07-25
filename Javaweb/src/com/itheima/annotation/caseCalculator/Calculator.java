package com.itheima.annotation.caseCalculator;

public class Calculator {
    @check
    public void add(){
        System.out.println("1+0="+(1+0));
    }
    @check
    public void sub(){
        System.out.println("1-0"+(1-0));
    }
    public void mul(){
        System.out.println("1*0"+(1*0));
    }
    public void show(){
        System.out.println("no bug...");
    }
}
