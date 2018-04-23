package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype{
   private String name;
    private Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    @Override
    public String toString() {
        String b = "     Library : " + name + "\n";
        for (Book book : books) {
            b = b + book + " \n";
        }
        return b;
    }
    public Library shallowClone() throws CloneNotSupportedException{
        return (Library) super.clone();
    }
    public Library deppeClone()throws CloneNotSupportedException{
       Library clonedLibrary =  (Library) super.clone();
       clonedLibrary.books = new HashSet<>();
        for (Book book: books ){
               clonedLibrary.books.add(book);

        }return clonedLibrary;
    }

}
