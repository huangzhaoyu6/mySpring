package com.my1.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/6
*/

import com.my.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// value = 扫描组件包范围
// includeFilters = 声明扫描组件需要扫描到的类型
// excludeFilters = 声名扫描组件不需要扫描到的类型 使用时需打开useDefaultFilters
@ComponentScan(value = "com.my1",includeFilters = {
        //声明类过滤器的类型  ANNOTATION通过注解指定  ASSIGNABLE_TYPE直接指明具体类型  CUSTOM使用自定义的类过滤器进行过滤
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {HzyFilter.class})
    },useDefaultFilters = false)
public class MainConfig {

    //给容器中注入一个bean，类型为该方法的返回值类型
    @Bean
    public Person setPerson(){
        return new Person("hzy2",24);
    }

}
