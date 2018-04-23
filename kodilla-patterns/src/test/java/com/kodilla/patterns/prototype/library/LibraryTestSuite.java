package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given

        Book book1 = new Book("do usuniecia","Usuwana",2018,04,05);
        Book book = new Book("VaskeMan", "Ole Hetland", 1582, 12, 26);
        Book book2 = new Book("Kapitan Tsubasa", "Kate Oltedal", 1927, 10, 25);
        Book book3 = new Book("Predator", "Bolo Jang", 1985, 2, 26);
        Library library = new Library("1st library");
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //creating shallowclone Library
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowClone();
            shallowCloneLibrary.setName("2nd library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //creating deeClone Library

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deppeClone();
            deepClonedLibrary.setName("3rd library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3,library.getBooks().size());
        Assert.assertEquals(3,shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),shallowCloneLibrary.getBooks());
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(),deepClonedLibrary.getBooks().size()-1);

    }
}
