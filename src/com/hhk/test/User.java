package com.hhk.test;

import com.hhk.dao.Student;

/**
 * @author: Kun Hong
 * @create: 20/6/2022 下午 9:41
 **/
public class User {
    public static void main(String[] args) {
        Student student = new Student(
                "Kun Hong",
                23,
                "male",
                "123456"
        );
        System.out.println(student.getName());
        System.out.println(student.getSex());
        System.out.println(student.getAge());
        System.out.println(student.getIDNumber());
    }
}
