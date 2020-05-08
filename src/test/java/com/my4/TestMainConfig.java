package com.my;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/8
*/

import com.my4.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainConfig {

    @org.junit.Test
    public void test01(){
        //单实例的情况下，在创建容器的时候就创建了对象
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器初始化完成");

        Object hzy = applicationContext.getBean("person");
        System.out.println(hzy+"---->获取对象完成");


    }



}
