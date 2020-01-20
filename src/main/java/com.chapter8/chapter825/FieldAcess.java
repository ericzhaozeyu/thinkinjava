package com.chapter8.chapter825;

/**
 * @author EricZhao
 * @version 1.0
 * @Description 静态方法是与类、而并非与单个对象相关联的
 * @date 2020/1/17 9:11
 */
public class FieldAcess {
    public static void main(String[] args) {
        Super upSub = new Sub();
        System.out.println(upSub.field);
        System.out.println("upSub.field = "+ upSub.field +",upSub.getField = "+upSub.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = "+ sub.field +",sub.getField = "+sub.getField()+",sub.getSuperField = "+sub.getSuperField());
    }
}

class Super{
    public int field =1;

    public int dad = 6;
    public int getField() {
        return field;
    }

}

class Sub extends Super{

    public int field = 2;

    public int getField() {
        return field;
    }

    public int getSuperField(){
        return super.field;
    }

    public int getDadvalue(){
        return dad;
    }
}
