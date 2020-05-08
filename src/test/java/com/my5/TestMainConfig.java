package com.my5;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/8
*/

import com.my5.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainConfig {

    @org.junit.Test
    public void test01(){
        //单实例的情况下，在创建容器的时候就创建了对象
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器初始化完成");
        //获取容器中所有bean的名称(key)
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


}
