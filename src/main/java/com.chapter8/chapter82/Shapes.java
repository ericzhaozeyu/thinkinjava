package com.chapter8.chapter82;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2020/1/16 16:31
 */
public class Shapes  {
    private static RandowShapeGenerator randowShapeGenerator = new RandowShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i =0;i<shapes.length;i++){
            shapes[i] = randowShapeGenerator.next();
        }
//        for (Shape shape : shapes) {
//            shape = randowShapeGenerator.next();
//        }
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
