package com.practice.practice10;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 18:41
 */
public class People extends Animal {

    public void shake(){
        System.out.println("挥手笑");
    }

    public static void main(String[] args) {
        Animal person = new People();
        person.beat();
    }
}
