package com.chapter8.chapter832;

import com.chapter8.chapter831.Sandwich;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/17 17:11
 */
public class Frog extends Amphibian{
    private Characteristic characteristic = new Characteristic("呱呱叫");
    private Description description = new Description("吃虫子");
    Frog(){
        super();
        System.out.println("青蛙frog");

    }
    protected void dispose(){
        System.out.println("frog青蛙销毁");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("再见");
        frog.dispose();
    }
}

class Characteristic{
    private String s;

    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic" +  s);
    }

    protected void dispose(){
        System.out.println("disposing Characteristic " + s);
    }
}

class Description{
    private String s;

    Description(String s){
        this.s = s;
        System.out.println("Creating Description" +  s);
    }

    protected void dispose(){
        System.out.println("dispose Description " + s);
    }
}

class LivingCreature{
    private Characteristic p = new Characteristic("活着");



    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    private Description description = new Description("活着的生物");

    protected void dispose(){
        System.out.println("LivingCreature disposing");
        description.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("has heart");
    private Description description = new Description("animal not vegetable");

    Animal(){
        super();
        System.out.println("Animal()");
    }

    protected void dispose(){
        System.out.println("Animal dispose");
        description.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic characteristic = new Characteristic("可以在水中生存");
    private Description description = new Description("可以在水陆两栖");
    Amphibian(){
        System.out.println("Amphibian两栖动物");
    }
    protected void dispose(){
        System.out.println("Amphibian两栖动物销毁");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }
}

