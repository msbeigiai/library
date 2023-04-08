package com.msbeigi.library;

import com.msbeigi.address.Address;
import com.msbeigi.book.Book;
import com.msbeigi.person.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Library implements LibRepository {
    private Address address;
    private String name;
    private List<Book> books;
    private List<User> users;

    public Library(Address address, String name, List<Book> books) {
        this.address = address;
        this.name = name;
        this.books = books;
        this.users = new ArrayList<>();
    }

    public Library(Address address, String name, List<Book> books, List<User> users) {
        this.address = address;
        this.name = name;
        this.books = books;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Library{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", books=" + books +
                ", users=" + users +
                '}';
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

    @Override
    public List<User> allUsers() {
        return users;
    }

    @Override
    public List<User> findUsersByName(String name) {
        return users.stream().filter(user -> user.getName().equals(name))
                .toList();
    }

    @Override
    public User findUserById(UUID id) {
        return users.stream().filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No user found"));
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addUserToLibrary(User user) {
        users.add(user);
    }
}
