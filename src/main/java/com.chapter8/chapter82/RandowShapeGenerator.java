package com.chapter8.chapter82;

import java.util.Random;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 16:01
 */
public class RandowShapeGenerator {

    private Random random = new Random();

    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
