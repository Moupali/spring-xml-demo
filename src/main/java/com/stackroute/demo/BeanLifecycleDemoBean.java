package com.stackroute.demo;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifecycleDemoBean  implements InitializingBean, DisposableBean
{
    @Override
    public void destroy() throws Exception {
        System.out.println("this is the destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("this is the property set method");
    }

   public void customInit()
   {
       System.out.println("Custom Init");
   }
    public void customDestroy()
    {
        System.out.println("Custom Destroy");
    }
}