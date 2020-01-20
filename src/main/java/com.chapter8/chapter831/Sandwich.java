package com.chapter8.chapter831;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/17 10:36
 */
class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Lunch extends Meal{
    Extra extra = new Extra();
    Lunch(){
        System.out.println("lunch");
    }
}

class Extra{
    Extra(){
        System.out.println("Extra");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("portableLunch");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

public class Sandwich extends PortableLunch{

    Bread bread = new Bread();
    Cheese cheese = new Cheese();
    Lettuce l = new Lettuce();

    public Sandwich(){
        System.out.println("Sandwich");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}

