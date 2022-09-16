package com.test.abstractfactory;

import com.test.abstractfactory.keyboard.Keyboard;
import com.test.abstractfactory.mouse.Mouse;

/**
 * Created by pzh on 2022/9/6.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Hardware macFactory = new MacFactory();
        Keyboard macKeyboard = macFactory.createKeyboard();
        macKeyboard.input();

        Hardware winFactory = new WinFactory();
        Mouse winMouse = winFactory.createMouse();
        winMouse.click();
    }
}
