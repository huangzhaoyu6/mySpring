package com.my5.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/8
*/

import com.my5.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *  AnnotationMetadata 当前类的注释信息
     *  BeanDefinitionRegistry BeanDefinition注册类
     *      把所有需要添加到容器中的bean加入到IOC容器中
     */

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean b = registry.containsBeanDefinition("com.my5.bean.Cat");
        boolean a = registry.containsBeanDefinition("com.my5.bean.Dog");

        if(a && b){
            //定义需要返回的RootBean所需要返回的实体
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            //注册本次声明的Bean
            registry.registerBeanDefinition("pig",beanDefinition);
        }

    }
}
