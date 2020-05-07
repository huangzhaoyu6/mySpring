package com.my;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/6
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类 = 配置文件
@Configuration
public class MainConfig {

    //给容器中注入一个bean，类型为该方法的返回值类型
    @Bean
    public Person setPerson(){
        return new Person("hzy2",24);
    }

}
