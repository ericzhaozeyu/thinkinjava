package com.chapter8.chapter832;

import org.junit.Test;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/21 11:16
 */
public class TestPlus {

    int i = 0;


    @Test
    public void getSys(){
        int h = i++;
        System.out.println(h);
        System.out.println(++i);
    }
}
