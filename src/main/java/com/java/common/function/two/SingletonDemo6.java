package com.java.common.function.two;

/**
 * @author liyongzhen
 * @create 2018-04-26 14:54
 **/
public class SingletonDemo6 {
    public String name="Hello单例";
    private static  class  SingletonHolder{
        private static final  SingletonDemo6 instance = new SingletonDemo6();
    }
    private SingletonDemo6(){};

    public static SingletonDemo6 getInstace (){
        return SingletonHolder.instance;
    }
}
