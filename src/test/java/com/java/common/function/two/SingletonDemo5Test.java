package com.java.common.function.two;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * @author liyongzhen
 * @create 2018-04-26 14:39
 **/
public class SingletonDemo5Test {
    @Test
    public void testPerson(){
        new SingletonDemo5(){
            public void  p2(){
                System.out.println(p.toString());
            }
        }.p2();
    }

    private void func(SingletonDemo5 singletonDemo5) {
        Person p3= singletonDemo5.p;
    }
}
