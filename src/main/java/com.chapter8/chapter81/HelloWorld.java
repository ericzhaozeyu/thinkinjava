package com.chapter8.chapter81;

import com.chapter8.chapter82.Circle;
import com.chapter8.chapter82.Shape;
import com.chapter8.chapter82.Square;
import com.chapter8.chapter82.Triangle;

import java.util.Random;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/15 17:13
 */
public class HelloWorld {
    Random random = new Random();
    public static Shape next(){
        switch (4){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public static void main(String[] args)
    {
        switch (4){
            default:
            case 0:
                System.out.println(0);
                System.out.println("----------");
                break;
            case 1:
                System.out.println(1);
                System.out.println("----------");
                break;
            case 2:
                System.out.println(2);
                System.out.println("----------");
                break;
        }
//        System.out.println(next());

        System.out.println("哈哈哈");
    }
}
