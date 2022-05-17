package com.lixingyuan.example.pojo;

public class Users {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Users() {
    }
}
