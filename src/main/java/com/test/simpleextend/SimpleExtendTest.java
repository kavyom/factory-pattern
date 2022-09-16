package com.test.simpleextend;

/**
 * Created by pzh on 2022/9/6.
 */
public class SimpleExtendTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
