package com.heecoo.learn.java.heecooeffectivejava.javaSe;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Heecoo
 * @Date: 2020/9/1 6:44 下午
 * @Version 1.0
 */
@Setter
@Getter
public class Student {
    private int id;
    private String name;
    private int age;
}

class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println("s1的引用地址："+s1);
        System.out.println("s2的引用地址："+s2);

        System.out.println("s1的hashcode："+s1.hashCode());
        System.out.println("s2的hashcode："+s2.hashCode());
    }
}
