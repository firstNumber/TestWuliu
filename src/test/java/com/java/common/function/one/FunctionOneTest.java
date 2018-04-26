package com.java.common.function.one;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyongzhen
 * @create 2018-04-26 9:28
 **/
public class FunctionOneTest {
    @Test
    public void testLambda(){
        Map<String,Object> maps = new HashMap<String,Object>(){{
            put("明星","杨幂");
            put("球星","C罗");
            put("美女","刘诗诗");
        }};
        maps.forEach((k,v)-> System.out.println(""+k+"\t"+v));

        for(Map.Entry enty :maps.entrySet()){
            System.out.println(enty.getKey()+"\t"+enty.getValue()+"***");
        }
        System.out.println("21321");

    }
}
