package com.java.common.function.two;

/**
 * @author liyongzhen
 * @create 2018-04-26 14:24
 **/
public class SingletonDemo3 {
    private  static SingletonDemo3 instance = new SingletonDemo3();
    private SingletonDemo3(){};

    public  static  SingletonDemo3 getInstace(){
        return instance;
    }

}
