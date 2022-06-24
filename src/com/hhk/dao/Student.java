package com.hhk.dao;

/**
 * @author: Kun Hong
 * @create: 20/6/2022 下午 9:38
 **/
public class Student {
    private String name;

    private Integer age;

    private String sex;

    private String IDNumber;

    public Student(String name, Integer age, String sex, String IDNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.IDNumber = IDNumber;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }
}
