package com.chapter8.chapter832;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/21 14:57
 */
class Shared{
    private int refcount = 0;

    private static long counter = 0;

    private final long id = counter++;

    public Shared(){
        System.out.println("Creating" + this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(--refcount == 0){
            System.out.println("disposing "+this);
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "refcount=" + refcount +
                ", id=" + id +
                '}';
    }
}

class Composing{

    private Shared shared;

    //静态变量为该类所有对象所用
    private static long counter = 0;


    private final long id = counter++;

    public Composing(Shared shared){
        System.out.println("Creating "+this);
        this.shared = shared;
        shared.addRef();
    }

    protected void dispose(){

        System.out.println("disposing "+ this);
        shared.dispose();

    }

    public String toString() {
        return "Composing{" +
                " id=" + id +
                '}';
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        System.out.println("---------销毁-----------");
        for(Composing composing : composings){
            composing.dispose();
        }
    }
}

