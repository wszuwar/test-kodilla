package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum theForum = new Forum();
               Map<Integer,ForumUser> theResultOfMapForumUser = theForum.getTheForumUserList().stream()
              .filter(forumUser -> forumUser.getSex()=='M')
              .filter(forumUser -> forumUser.getBirthDate().plusYears(20).isBefore(LocalDate.now()))
              .filter(forumUser -> forumUser.getNumberOfPosts()>1)
              .collect(Collectors.toMap(ForumUser::getUserId,ForumUser-> ForumUser));

        theResultOfMapForumUser.entrySet().stream()
                .map(entry -> entry.getKey()+ " " + entry.getValue())
                .forEach(System.out::println);

    }
}
