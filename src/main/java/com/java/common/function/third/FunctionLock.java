package com.java.common.function.third;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liyongzhen
 * @create 2018-04-26 15:09
 **/
public class FunctionLock {

    private Lock lock = new ReentrantLock();

    public void method(Thread thread){
        lock.lock();
        try {
            System.out.println("线程名"+thread.getName()+"获得了锁");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("线程名"+thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
