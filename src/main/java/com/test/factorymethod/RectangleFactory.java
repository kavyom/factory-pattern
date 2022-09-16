package com.test.factorymethod;

/**
 * Created by pzh on 2022/9/6.
 */
public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
