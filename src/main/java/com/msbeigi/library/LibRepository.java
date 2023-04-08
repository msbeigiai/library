package com.msbeigi.library;

import com.msbeigi.book.Book;
import com.msbeigi.person.User;

import java.util.List;
import java.util.UUID;

public interface LibRepository {
    List<Book> allBooks();
    Book findBookById(UUID id);
    List<User> allUsers();
    List<User> findUsersByName(String name);
    User findUserById(UUID id);
    void addUserToLibrary(User user);

}
