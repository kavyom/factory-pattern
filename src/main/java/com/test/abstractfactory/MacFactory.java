package com.test.abstractfactory;

import com.test.abstractfactory.keyboard.Keyboard;
import com.test.abstractfactory.keyboard.MacKeyboard;
import com.test.abstractfactory.mouse.MacMouse;
import com.test.abstractfactory.mouse.Mouse;

/**
 * Created by pzh on 2022/9/6.
 */
public class MacFactory implements Hardware {

    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }
}
