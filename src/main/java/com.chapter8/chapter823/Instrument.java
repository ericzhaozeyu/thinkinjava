package com.chapter8.chapter823;

import com.chapter8.chapter81.Note;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/15 17:49
 */
public class Instrument {

    void play(Note n){
        System.out.println("Instrument.play()");
    }

    @Override
    public String toString() {
        return what();
    }

    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
