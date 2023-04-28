package com.atguigu01.collection;

import java.util.Objects;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:30
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }


}
