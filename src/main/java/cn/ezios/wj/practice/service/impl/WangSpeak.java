package cn.ezios.wj.practice.service.impl;

import cn.ezios.wj.practice.service.Speak;

public class WangSpeak implements Speak {
    @Override
    public void speak() {
        System.out.println("王说：你好吗？");
    }
}
