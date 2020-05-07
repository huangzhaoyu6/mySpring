package com.my2.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/6
*/

import com.my.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {
    //范围  用来定义该注解类的创建方式是
    //          单实例(singleton:单例模式 IOC容器启动时 通过工厂模式创建对象 )
    //          还是多实例(prototype:基础原型模式 getbean时 通过new产生对象)
    //          request:主要针对web应用，递交一次请求，创建一个实例
    //          session:同一个sessio创建一个实例
    @Scope("singleton")
    //给容器中注入一个bean，类型为该方法的返回值类型，默认创建方式是单实例
    @Bean
    public Person setPerson(){
        return new Person("hzy2",24);
    }

}
