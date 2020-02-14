package com.pratice.pratice9;

import com.chapter8.chapter81.Note;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/13 10:51
 */
abstract class Instrument implements Playable{

    private int i;



    public abstract void adjust();

    public String what(){
        return "Instrument";
    }
}

interface Playable{
    void play(Note note);
}

class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("wind.play()" + note);
    }

    public String what() {
        return "wind";
    }


//    @Override
//    public String what() {
//        return super.what();
//    }

    public void adjust() {

    }
}

class Persussion extends Instrument {

    public void play(Note note) {
        System.out.println("Persussion.play()" + note);
    }

    @Override
    public String what() {
        return "Persussion";
    }

    public void adjust() {

    }
}

class Stringed extends Instrument {

    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    public void adjust() {

    }
}

class Brass extends Wind {

    public void play(Note note) {
        System.out.println("Persussion.play()" + note);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {

    public void play(Note note) {
        System.out.println("Woodwind.play()" + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }

}


public class Music5 {

    static void tune(Playable instrument){
        instrument.play(Note.MIDDLE_C);

    }

    static void tuneAll(Playable[] instruments){
        for (Playable instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {

        Playable[] instruments = {
                new Wind(),
                new Persussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(instruments);


        Wind wind = new Wind();
        System.out.println(wind.what());
        Brass brass = new Brass();
        brass.what();


    }
}
