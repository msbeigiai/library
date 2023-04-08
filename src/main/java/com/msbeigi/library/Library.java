package com.msbeigi.library;

import com.msbeigi.address.Address;
import com.msbeigi.book.Book;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Library implements LibRepository {
    private Address address;
    private String name;
    private List<Book> books;

    public Library(Address address, String name, List<Book> books) {
        this.address = address;
        this.name = name;
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Library{");
        sb.append("address=").append(address);
        sb.append(", name='").append(name).append('\'');
        sb.append(", books=").append(books);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<Book> allBooks() {
        return books;
    }

    @Override
    public Book findBookById(UUID id) {
        return books.stream().filter(book -> book.getId().equals(id))
                .toList()
                .get(0);
    }
}
