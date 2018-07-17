package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book = new Book("John Kapec","Ogniem i serem",1985,"9988");
        Book book1 = new Book("Czeslaw Harnas","Napijmy Sie",2017,"8899");
        Book book2 = new Book("Monika Halama","koko jumbo", 2005,"7799");

        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2005,result);
    }
}
