package com.jc.spring.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


import static org.junit.Assert.*;

/**
 * Created by jingchun.zhang on 2018/7/5.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class MyTestBeanTest {

    @Test
    public void testBean() throws Exception {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyTestBean bean = (MyTestBean)beanFactory.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }
}