package com.itheima.reflections;

import com.itheima.domain.Person;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Constructor;

public class ReflectionConstructor {
    public static void main(String[] args) throws Exception {
        Class personClass= Person.class;
        Constructor constructor= personClass.getConstructor(String.class,int.class);
        Object p1=constructor.newInstance("lida",22);
        System.out.println(p1);

        //the following method can be simplified
        Constructor c2= personClass.getConstructor();
        Object p2=c2.newInstance();
        System.out.println(p2);

        Object o=personClass.newInstance();
        System.out.println(o);
    }


}
