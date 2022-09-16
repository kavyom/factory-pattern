package com.test.abstractfactory.mouse;

/**
 * Created by pzh on 2022/9/6.
 */
public class MacMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Mac 鼠标点击");
    }
}
