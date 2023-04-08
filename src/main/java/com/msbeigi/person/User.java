package com.msbeigi.person;

import com.msbeigi.book.Book;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class User extends Person {
    private List<Book> books;
    private UUID id;
    public User() {
        super();
    }

    public User(String name, int age) {
        super(name, age);
        id = UUID.randomUUID();
        books = List.of(new Book());
    }

    public User(String name, int age, List<Book> books) {
        super(name, age);
        id = UUID.randomUUID();
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("books=").append(books);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public UUID getId() {
        return id;
    }
}
