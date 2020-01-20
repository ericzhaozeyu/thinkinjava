package com.chapter8.chapter81;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/15 17:52
 */
public class Music {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {

        //flute长笛
        Wind flute = new Wind();
        tune(flute);
    }
}
