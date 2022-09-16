package com.test.abstractfactory;

import com.test.abstractfactory.keyboard.Keyboard;
import com.test.abstractfactory.keyboard.WinKeyboard;
import com.test.abstractfactory.mouse.Mouse;
import com.test.abstractfactory.mouse.WinMouse;

/**
 * Created by pzh on 2022/9/6.
 */
public class WinFactory implements Hardware {

    @Override
    public Keyboard createKeyboard() {
        return new WinKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new WinMouse();
    }
}
