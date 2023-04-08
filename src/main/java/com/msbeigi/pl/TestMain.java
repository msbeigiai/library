package com.msbeigi.pl;

import com.msbeigi.address.Address;
import com.msbeigi.book.Book;
import com.msbeigi.library.Library;
import com.msbeigi.person.Author;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Author nasimTaleb = new Author("Nasim Taleb", 77);
        Author pooper = new Author("Carl Pooper", 98);
        Book blackSwan = new Book("Black Swan", nasimTaleb);
        Book life = new Book("Life", pooper);
        Library library =
                new Library(new Address("Nazi Abad", "Tehran"), "Rajaee", Arrays.asList(blackSwan, life));

        System.out.println(library.allBooks());
        System.out.println(library.findBookById(library.allBooks().get(0).getId()));

    }


}
