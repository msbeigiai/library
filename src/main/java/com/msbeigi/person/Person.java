package com.msbeigi.person;

import java.util.UUID;

abstract class Person {
    protected UUID id;
    protected String name;
    protected int age;

    public Person() {
        id = new UUID(0, 0);
        name = "";
        age = 0;
    }

    public Person(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
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
}
