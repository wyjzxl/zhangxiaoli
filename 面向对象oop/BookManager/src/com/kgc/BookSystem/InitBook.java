package com.kgc.BookSystem;

public class InitBook {
    public static Book[] books=new Book[100];
    static{
        books[0]=new Book(1,"安徒生童话",9000,15.5);
        books[1]=new Book(2,"十万个笑话",9000,20.0);
    }
}
