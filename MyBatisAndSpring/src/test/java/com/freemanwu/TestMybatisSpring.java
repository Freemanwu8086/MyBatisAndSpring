package com.freemanwu;

import com.freemanwu.entity.User;
import com.freemanwu.dao.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatisSpring {

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");

        User user = new User();
        user.setUsername("xiaowb");
        user.setPassword("666666");

        userDAO.save(user);
    }
}
