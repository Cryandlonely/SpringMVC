package com.lonely.example.pojo;

import java.util.Date;

public class Student {
    private String name;
    private Date date;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Student(Date date) {
        this.date = date;
    }
}
