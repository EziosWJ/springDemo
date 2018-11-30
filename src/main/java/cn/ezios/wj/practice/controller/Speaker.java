package cn.ezios.wj.practice.controller;

import cn.ezios.wj.practice.service.Speak;

public class Speaker {

    private Speak speakService;

    public void speak(){
        speakService.speak();
    }

    public void setSpeakService(Speak speakService) {
        this.speakService = speakService;
    }
}

