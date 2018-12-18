package cn.ezios.wj.practice;

import cn.ezios.wj.practice.bean.CarBean;
import cn.ezios.wj.practice.bean.PersonBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName BeanTest
 * @Description TODO
 * @Date 2018/12/18 22:06
 * @Creaded By Wangj
 */
public class BeanTest {

    private ApplicationContext getAc(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        return ac;
    }
    private Object getBean(String name){
        return getAc().getBean(name);
    }
    @Test
    public void testCar01(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
//        CarBean car01 = (CarBean) ac.getBean("car");
        CarBean car01 = (CarBean) getBean("car");
        System.out.println(car01);
    }
    @Test
    public void testPersonwj(){
        PersonBean wj = (PersonBean) getBean("wangjian");
        System.out.println(wj);
    }
}
