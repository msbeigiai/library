package com.msbeigi.person;

import java.util.UUID;

public class User extends Person {
    public User() {
        super();
    }

    public User(UUID id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
