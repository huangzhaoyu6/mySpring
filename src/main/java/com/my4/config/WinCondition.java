package com.my4.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/8
*/

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {

    /**
     * FactoryBean和BeanFactory的区别：
     *  我们可以通过FactoryBean将java实例注册到容器中
     *  我们可以通过BeanFactory从容器中获取到bean
     *
     * ConditionContext: 供当前条件使用的上下文信息
     * AnnotatedTypeMetadata：获取注释的信息
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //可以获取到IOC容器正在使用的BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取到当前上下文的运行环境信息
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }

}
