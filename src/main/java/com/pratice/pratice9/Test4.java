package com.pratice.pratice9;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/13 12:12
 */

abstract class E05A{

}

class  E05B extends E05A{
    public void say(){
        System.out.println("E05B.say()");
    }
}

abstract class E05A1{
    public abstract void say();
}

class  E05B1 extends E05A1{
    public void say(){
        System.out.println("E05B1.say()");
    }
}
public class Test4 {

    static void cast(E05A e05A){
        E05B e05A1 = (E05B) e05A;
        e05A1.say();
    }

    public static void main(String[] args) {
        E05A e05A = new E05B();
        cast(e05A);
        E05B e05A2 = (E05B) e05A;
        e05A2.say();
        System.out.println("-----------------");
        E05A1 e05A1 = new E05B1();
        E05B1 e05A11 = (E05B1) e05A1;
        e05A11.say();
    }
}
