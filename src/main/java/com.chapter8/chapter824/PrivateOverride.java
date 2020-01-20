package com.chapter8.chapter824;

/**
 * @author EricZhao
 * @version 1.0
 * @Description 父类的私有化方法对导出类是屏蔽的，所以子类的方法不能被重载是一个全新的方法
 * @date 2020/1/17 8:57
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private f**");
    }

    public static void main(String[] args) {
        PrivateOverride d = new Derived();
        d.f();
    }
}


class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f**");
    }
}
