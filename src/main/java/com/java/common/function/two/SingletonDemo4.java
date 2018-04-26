package com.java.common.function.two;


/**
 * @author liyongzhen
 * @create 2018-04-26 14:33
 **/
public class SingletonDemo4 {
    private static  SingletonDemo4 instance =null;
    private SingletonDemo4(){};
    static {
        instance = new SingletonDemo4();
    }

    public static  SingletonDemo4 getInstance(){
        return instance;
    }
}
