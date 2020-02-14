package com.chapter8.chapter85;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/9 12:22
 */
class Actor{
    public void act(){};
}

class HapppyActor extends Actor{
    public void act(){
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor{
    public void act(){
        System.out.println("SadActor");
    }
}

class Stage{
    private Actor actor = new HapppyActor();

    public void change(){
        actor = new SadActor();
    }

    public void performPlay(){
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();

    }
}
