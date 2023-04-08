package com.msbeigi.library;

import com.msbeigi.book.Book;

import java.util.List;
import java.util.UUID;

public interface LibRepository {
    List<Book> allBooks();
    Book findBookById(UUID id);

}
