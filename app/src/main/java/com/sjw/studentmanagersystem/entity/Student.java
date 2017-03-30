package com.sjw.studentmanagersystem.entity;

/**实体类：student
 * Created by 石景文 on 2017/3/30.
 */

public class Student {
    private String no;
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String no, String name, int age) {
        super();
        this.no = no;
        this.name = name;
        this.age = age;
    }
}
