package com.itheima.annotation.caseCalculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

/* simple test frame
    when main method 自动执行加了check注解的方法，判断方法是否有异常，记录到文件中
 */
public class CaseAnnotation {
    public static void main(String[] args) throws Exception{
        //1. 创建计算器对象
        Calculator calculator=new Calculator();
        //2. get class file字节码文件
        Class cls=calculator.getClass();
        //3. get all methods
        Method[] methods=cls.getMethods();

        int number=0;
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));

        for(Method method:methods){
            //4. has @check ?
            if(method.isAnnotationPresent(check.class)){
                //5. execute
                try {
                    method.invoke(calculator);
                }catch (Exception e){
                    //6. catch exception & record in doc
                    number ++;
                    bw.write(method.getName()+"exception in...");
                    bw.newLine();
                    bw.write("reason for exception..."+e.getClass().getSimpleName());
                    bw.newLine();
                    bw.write("-------------------");
                }
            }
        }
        bw.write(number+"times exception in total");
        bw.close();

    }
}
