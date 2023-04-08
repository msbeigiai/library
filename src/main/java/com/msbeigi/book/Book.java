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

    public Book(String name, Author author) {
        this.id = UUID.randomUUID();
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
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }

    public UUID getId() {
        return id;
    }
}
