package com.practice.practice10;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 18:39
 */
public class Animal {
    public void shake(){
        System.out.println("挥手");
    }
    public void beat(){
        shake();
        System.out.println("出拳");
    }
}
