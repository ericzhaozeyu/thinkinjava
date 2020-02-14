package com.chapter8.chapter84;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/23 12:09
 */

/**
 * @Description 粮食
 */
class Grain{
    public String toString(){
        return "Grain";
    }
}
/**
 * @Description 小麦
 */
class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}

/**
 * @Description 协变返回类型
 * 导出类（子类）覆盖（即重写）基类（父类）方法时，返回的类型可以是基类方法返回类型的子类
 */
class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Grain process(){
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain process = mill.process();
        System.out.println(process);
        //预计输出grain
        mill = new WheatMill();
        //协变返回类型允许返回更具体的类型
        process = mill.process();
        System.out.println(process);
        //预计输出wheat
    }
}
