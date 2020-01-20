package com.chapter8.chapter823;

import com.chapter8.chapter81.Note;

import java.util.Random;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 17:43
 */
public class Music3 {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
        System.out.println(i);
    }

    public static void tuneAll(Instrument[] i){
        for (Instrument instrument : i) {
            tune(instrument);
        }
    }

    public static Instrument getInstruments(){
        Random random = new Random();
        switch (random.nextInt(5)){
            default:
            case 0: return new Brass();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Wind();
            case 4: return new Woodwind();
        }
    }

    public static void main(String[] args) {

        //向上转型
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        //随机向上转型
        Instrument[] randomOrchestra = {
                getInstruments(),
                getInstruments(),
                getInstruments(),
                getInstruments(),
                getInstruments(),
        };

//        tuneAll(orchestra);
        tuneAll(randomOrchestra);
    }


}
