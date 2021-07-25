package com.itheima.reflections;

import com.itheima.domain.Person;
import com.itheima.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*框架类*/
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /*前提：不能改变该类的任何代码*/
//        Person p=new Person();
//        p.eat();

        // 1. load config file
        //1.1 create properties object
        Properties pro=new Properties();
        //1.2 load config file , convert it to a set
            // 获取class目录下的配置文件
        ClassLoader classLoader= ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties"); //字节流
        pro.load(is);

        //2. 获取配置文件中定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");

        //3. 加载该类进内存
        Class cls=Class.forName(className);
        //4. 创建对象
        Object obj=cls.newInstance();
        //5. 获取方法对象
        Method method=cls.getMethod(methodName);
        //6. 执行方法
        method.invoke(obj);

        Class clstudent= Student.class;
        clstudent.getMethod(pro.getProperty("methodName2")).invoke(clstudent.newInstance());

    }
}
