package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1,"Czeslaw Kradziej",'M',1987,2,3,12));
        theForumUserList.add(new ForumUser(2,"John Polisz",'M',1968,4,6,2));
        theForumUserList.add(new ForumUser(3,"Angelika Free",'F',1998,6,3,17));
        theForumUserList.add(new ForumUser(4,"Romek Soltys",'M',1998,8,13,5));
        theForumUserList.add(new ForumUser(5,"Anne Jakobsen",'F',1995,4,10,0));
        theForumUserList.add(new ForumUser(6,"Romek Soltys",'M',1978,9,1,0));
        theForumUserList.add(new ForumUser(7,"Iselin Reigstad",'F',1998,11,13,5));
        theForumUserList.add(new ForumUser(8,"Kai Haughstad",'M',1984,1,13,5));
        }

        public List<ForumUser> getTheForumUserList(){
        return new ArrayList<>(theForumUserList);
        }
}
