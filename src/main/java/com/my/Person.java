package com.my;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/6
*/

public class Person {

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
