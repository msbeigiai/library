package com.msbeigi.book;

import com.msbeigi.person.Author;

import java.util.UUID;

public class Book {
    private UUID id;
    private String name;
    private Author author;

    public Book() {
        name = "";
        author = new Author();
    }

    public Book(UUID id, String name, Author author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
