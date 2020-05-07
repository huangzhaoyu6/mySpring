package com.my1;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/7
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.my1.config.MainConfig;
public class TestMainConfig {

    @org.junit.Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取容器中所有bean的名称(key)
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }


}
