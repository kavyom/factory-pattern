package com.test.factorymethod;

/**
 * Created by pzh on 2022/9/6.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = circleFactory.getShape();
        //调用 Circle 的 draw 方法
        circle.draw();

        Factory rectangleFactory = new RectangleFactory();
        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = rectangleFactory.getShape();
        //调用 Rectangle 的 draw 方法
        rectangle.draw();
    }
}
