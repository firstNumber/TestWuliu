package com.java.common.function.two;

/**
 * @author liyongzhen
 * @create 2018-04-26 14:13
 **/
public class SingletonDemo1 {
    private static SingletonDemo1 instance;
    private SingletonDemo1(){};
    public static SingletonDemo1 getInstance(){
        if(instance == null){
            instance = new SingletonDemo1();
        }
        return instance;
    }
}
