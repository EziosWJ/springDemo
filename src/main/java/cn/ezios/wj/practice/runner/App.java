package cn.ezios.wj.practice.runner;

import cn.ezios.wj.practice.controller.Speaker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("spring-config.xml");
        Speaker speaker = (Speaker) ac.getBean("speaker");
        speaker.speak();
    }
}
