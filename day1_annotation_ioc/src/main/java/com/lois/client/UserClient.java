package com.lois.client;


import com.lois.dao.UserDao;
import com.lois.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试类，spring的ioc容器不能直接在test包中测试，这个问题我们在后面再说
 */
public class UserClient {
    public static void main(String[] args) {
        //根据配置文件生成Spring容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        BeanFactory ac = new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));

        //从IOC容器中根据id获取对象
        UserDao userDao = ac.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);
        //注意getBean的重载
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        System.out.println(userService);

        userService.show();
        userDao.show();
        ac.close();
    }
}
