/**
 * Created by jingchun.zhang on 2018/7/5.
 */
package com.jc.spring.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.net.URL;

/**
 * @author jingchun.zhang
 * @version 1.0.0
 * @date 2018/7/5
 */
public class Main {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyTestBean bean = (MyTestBean)beanFactory.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }

}
