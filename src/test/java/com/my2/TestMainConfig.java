package com.my2;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/7
*/

import com.my2.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainConfig {

    @org.junit.Test
    public void test01(){
        //单实例的情况下，在创建容器的时候就创建了对象
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取容器中所有bean的名称(key)
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        //多实例的情况下仅在获取bean的时候才去创建bean
        Object bean = applicationContext.getBean("setPerson");
        Object bean2 = applicationContext.getBean("setPerson");
        System.out.println(bean==bean2);
    }


}
