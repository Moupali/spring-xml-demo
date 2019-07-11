package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import sun.awt.X11.XAbstractMenuItem;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=applicationContext.getBean("movie1",Movie.class);
        Movie movie2=applicationContext.getBean("movie1",Movie.class);

        movie1.acting();

//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie2=beanFactory.getBean("movie1",Movie.class);
//        movie2.acting();
//
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("/home/moupalidutta/Desktop/SpringExercise/src/main/resources/beans.xml"));
//        Movie movie3= ((DefaultListableBeanFactory)beanFactory).getBean(Movie.class);
//        movie3.acting();

//        Movie actor1=applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1==movie2);

    }
}
