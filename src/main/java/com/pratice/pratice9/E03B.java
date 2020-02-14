package com.pratice.pratice9;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/13 11:51
 */

abstract class E03A{
    public abstract void print();

    public E03A() {
        print();
    }
}

class E04A{
    public  void print(){

    }

    public E04A() {
        print();
    }
}

class E04B extends E04A {

    private int b = 24;

    public void print() {
        System.out.println("E04B.number=" + b);
    }

    public E04B() {
        print();
    }
}
public class E03B extends E03A{

    private int a = 22;

    public void print() {
        System.out.println("E03B.number="+a);
    }

    public E03B() {
        print();
    }

    public static void main(String[] args) {
        E03B e03B = new E03B();
        e03B.print();

        System.out.println("------------------------");

        E04B e04B = new E04B();
        e04B.print();
    }
}
