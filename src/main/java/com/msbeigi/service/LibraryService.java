package com.msbeigi.service;

import com.msbeigi.book.Book;
import com.msbeigi.library.LibRepository;
import com.msbeigi.person.User;

import java.util.List;
import java.util.UUID;

public class LibraryService {
    private final LibRepository libRepository;

    public LibraryService(LibRepository libRepository) {
        this.libRepository = libRepository;
    }

    public List<Book> findAllBooks() {
        return libRepository.allBooks();
    }

    public Book findBookById(UUID id) {
        return libRepository.findBookById(id);
    }

    public List<User> allUsers() {
        return libRepository.allUsers();
    }
    public List<User> findUsersByName(String name) {
        return libRepository.findUsersByName(name);
    }
    public User findUserById(UUID id) {
        return libRepository.findUserById(id);
    }
    public void addUserToLibrary(User user) {
        libRepository.addUserToLibrary(user);
    }


}
