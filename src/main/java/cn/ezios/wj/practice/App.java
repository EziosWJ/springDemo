package cn.ezios.wj.practice;

import cn.ezios.wj.practice.bean.CustomerBean;
import cn.ezios.wj.practice.dao.CustomerDao;
import cn.ezios.wj.practice.service.Speak;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
//        Parent parent = (Parent) ac.getBean("wParent");
//        System.out.println("your parent is " + parent.toString());
//        Speak speakService = (Speak) ac.getBean("speakService");
//        speakService.speak();

        CustomerDao customerDao = (CustomerDao) ac.getBean("customerDao");
        CustomerBean customerBean = new CustomerBean("cus03","father","车子");
        customerDao.insert(customerBean);
        customerDao.findById("cus03");
    }
}
