package com.msbeigi.person;

public class Author extends Person {
    public Author() {
    }

    public Author(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Author{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
