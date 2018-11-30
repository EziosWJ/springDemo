package cn.ezios.wj.practice.service.impl;

import cn.ezios.wj.practice.service.Speak;

public class YuanSpeak implements Speak {
    @Override
    public void speak() {
        System.out.println("原说：我好呀！");
    }
}
