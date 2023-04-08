package com.msbeigi.pl;

import com.msbeigi.address.Address;
import com.msbeigi.book.Book;
import com.msbeigi.library.Library;
import com.msbeigi.person.Author;
import com.msbeigi.person.User;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Author nasimTaleb = new Author("Nasim Taleb", 77);
        Author pooper = new Author("Carl Pooper", 98);
        Book blackSwan = new Book("Black Swan", nasimTaleb);
        Book life = new Book("Life", pooper);
        User mohsen = new User("Mohsen", 33, List.of(blackSwan));
        Library library =
                new Library(new Address("Nazi Abad", "Tehran"), "Rajaee", Arrays.asList(blackSwan, life));
        library.addUserToLibrary(mohsen);

        /*System.out.println(library.allBooks());
        System.out.println(library.findBookById(library.allBooks().get(0).getId()));
        System.out.println(library.allUsers());
        System.out.println(library.findUserById(mohsen.getId()));
        System.out.println(library.findUsersByName("Mohsen"));*/
        User faezeh = new User("Zahra", 19, List.of(life, blackSwan));
        library.addUserToLibrary(faezeh);
        // System.out.println(library.allUsers());

        System.out.println("type 'l/u' to list all books/users in library: ");
        System.out.println("type 'fbi' to find a book by its 'id': ");
        System.out.println("type 'fun' to find a user by its 'name': ");

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            switch (input.next()) {
                case "l" -> System.out.println(library.allBooks());
                case "u" -> System.out.println(library.allUsers());
                case "fun" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("provide user name: ");
                    String userName = scanner.nextLine();
                    System.out.println(library.findUsersByName(userName));
                }
                default ->
                        System.out.println("please provide valid input 'l/u/fun' list all books/users and user by 'name'");
            }
        }


    }


}
