package com.msbeigi.service;

import com.msbeigi.book.Book;
import com.msbeigi.library.LibRepository;

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



}
