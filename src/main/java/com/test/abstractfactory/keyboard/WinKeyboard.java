package com.test.abstractfactory.keyboard;

/**
 * Created by pzh on 2022/9/6.
 */
public class WinKeyboard implements Keyboard {
    @Override
    public void input() {
        System.out.println("Win 键盘输入");
    }
}
