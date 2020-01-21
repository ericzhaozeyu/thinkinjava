package com.chapter8.chapter833;

import java.util.Random;

/**
 * @author EricZhao
 * @version 1.0
 * @Description 父类方法会被子类覆盖，但在其他任何事物发生之前，将分配给对象的存储空间初始化成二进制的零，如初始化下方父类输出int为0，字符串为null
 * @date 2020/1/21 18:46
 */
class Glyph{

    void draw(){
        System.out.println("Glyph.draw");
    }

    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    public static void main(String[] args) {
        Glyph glyph = new Glyph();
    }
}

public class RoundGlyph extends Glyph{

    private int radius = 1;

    private  String string = "qwe";


    RoundGlyph(int i){
        radius = i;
        System.out.println("RoundGlyph.RoundGlyph(), radius= " + radius +" String= " + string);
    }


    void draw() {
        System.out.println("RoundGlyph.draw(), radius= " + radius +" String= " + string);
    }

    public static void main(String[] args) {
//        RoundGlyph ra = new RoundGlyph(5);
        Glyph rb = new RoundGlyph(6);
    }
}
