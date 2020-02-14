package com.chapter8.chapter84.test;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/2/9 12:36
 */
class  AlertStatus{
    public void alert(){}
}

class  RedAlertStatus extends AlertStatus{
    public void alert(){
        System.out.println("RedAlertStatus");
    }
}

class  YellowAlertStatus extends AlertStatus{
    public void alert(){
        System.out.println("YellowAlertStatus");
    }
}

class  GreenAlertStatus extends AlertStatus{
    public void alert(){
        System.out.println("GreenAlertStatus");
    }
}


class Stage{
    public void stage(){

    }
}

public class Starship {
}
