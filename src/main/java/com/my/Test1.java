package com.my;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/6
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {


    /**
     *
     * IOC容器将bean存放在一个MAP中，map的key就是bean的id，value是bean的实体
     * @bean("xxx") 注解可以通过该方式修改id
     *
     */
    public static void main(String[] args) {
        //将beans.xml中的类加载到容器中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取到bean，如果是xml方式，根据id获取
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        //将注解了的类加载到容器中
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfig.class);
        //从容器中获取到bean，如果是注解方式，根据方法名称获取，如果不是标注在方法上，则取类名称的小写
        Person person2 = (Person) applicationContext1.getBean("setPerson");
        System.out.println(person2);


    }

}
