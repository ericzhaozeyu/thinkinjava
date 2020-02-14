package com.chapter8.chapter85.chapter852;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/9 14:21
 */
class Useful{
    public void f(){}
    public void g(){}

}

class MoreUseful extends Useful{
    public void f(){
        System.out.println("moreuseful.f");
    }
    public void g(){
        System.out.println("moreuseful.g");
    }
    public void u(){}
    public void v(){}
    public void w(){
        System.out.println("moreuseful.w");
    }

}
public class RTTI {

    public static void main(String[] args) {
        Useful[] usefuls = {new Useful(),new MoreUseful()};
        usefuls[0].f();
        usefuls[1].g();
        MoreUseful g = (MoreUseful) usefuls[1];
        MoreUseful u = (MoreUseful) usefuls[0];
        g.w();
        u.f();


    }
}
