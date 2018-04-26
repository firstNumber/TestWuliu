package com.java.common.function.third;

import org.junit.Test;

/**
 * @author liyongzhen
 * @create 2018-04-26 15:12
 **/
public class FunctionLockTest {
    @Test
    public void testLock(){
        FunctionLock functionLock = new FunctionLock();
        Thread  t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                functionLock.method(Thread.currentThread());
            }
        },"t1");

        Thread  t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                functionLock.method(Thread.currentThread());
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
