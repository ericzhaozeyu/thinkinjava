package com.chapter8.chapter823;

import com.chapter8.chapter81.Note;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 17:25
 */
public class Percussion extends Instrument {
    
    void play(Note n) {
        System.out.println("Percussion.play" + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
