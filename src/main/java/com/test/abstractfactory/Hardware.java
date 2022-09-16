package com.test.abstractfactory;

import com.test.abstractfactory.keyboard.Keyboard;
import com.test.abstractfactory.mouse.Mouse;

/**
 * Created by pzh on 2022/9/6.
 */
public interface Hardware {

    Keyboard createKeyboard();

    Mouse createMouse();
}
