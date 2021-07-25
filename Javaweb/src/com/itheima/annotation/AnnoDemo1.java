package com.itheima.annotation;
/**
* annotation javadoc
* @author itcat
* @version 1.0
* @since 1.5
* */
public class AnnoDemo1 {
    /**@param a
     * @return fibbanacii
    * */
    public int fib(int a){
        if(a==1||a==2)
            return 1;
        return fib(a-1)+a;
    }
}
