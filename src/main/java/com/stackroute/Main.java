package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import java.nio.file.Files;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main {
    public static void main(String[] args)
    {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=applicationContext.getBean("movie1",Movie.class);
        movie1.setApplicationContext(applicationContext);
        movie1.setBeanName("Moupali");

        System.out.println(movie1.getActor());

      BeanFactory xmlBeanFactory=new XmlBeanFactory(new FileSystemResource("src/main/resources/beans.xml"));
      Movie movieFirst=(Movie)xmlBeanFactory.getBean("movie1");
      movieFirst.setBeanFactory(xmlBeanFactory);
      applicationContext.getBean("bean-lifecycledemo");

      applicationContext.registerShutdownHook();
        applicationContext.getBean("beanpostprocessordemobean");




    }
}
