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
 * @Description
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
        mill = new WheatMill();
        process = mill.process();
        System.out.println(process);
    }
}
