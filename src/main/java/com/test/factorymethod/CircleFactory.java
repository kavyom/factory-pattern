package com.test.factorymethod;

/**
 * Created by pzh on 2022/9/6.
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
