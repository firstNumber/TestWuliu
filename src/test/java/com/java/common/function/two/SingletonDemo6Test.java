package com.java.common.function.two;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;

/**
 * @author liyongzhen
 * @create 2018-04-26 14:57
 **/
public class SingletonDemo6Test {

    @Test
    public void testSingleton(){
        SingletonDemo6 instace =  SingletonDemo6.getInstace();
        System.out.println(instace.name);

        SingletonDemo6 instace2 =  SingletonDemo6.getInstace();
        instace2.name ="222";
        System.out.println(instace2.name);
    }
}
