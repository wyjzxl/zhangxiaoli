package com.kgc.BookSystem.Opera;
import com.kgc.BookSystem.Book;
import com.kgc.BookSystem.InitBook;
public class OperaImpl {
    Book[]books= InitBook.books;
    public void addBook(Book book) {
        boolean flag=false;
        for (int i = 0; i <books.length ; i++) {
            if(books[i]==null){
                books[i]=book;
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("图书已满,放不下了!");
        }
    }
    public void updateBook(int bookId,int bookDj) {
        boolean flag=false;
        for (int i = 0; i <books.length ; i++) {
            if(books[i]!=null) {
                if (books[i].getBookId()== bookId) {
                    books[i].setBookNum(bookDj);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }
    public void deleteBook(int bookId) {
        boolean flag=false;
        for (int i = 0; i <books.length ; i++) {
            if(books[i]!=null) {
                if (books[i].getBookId() == bookId) {
                    books[i]=null;
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }
    public void showBookInf() {
        System.out.println("图书编号\t\t图书名称\t\t图书数量\t\t单价");
        for (int i = 0; i <books.length ; i++) {
            if(books[i]!=null) {
                System.out.println(books[i].getBookId()
                        +"\t\t\t\t"+books[i].getBookName()
                        +"\t\t"+books[i].getBookNum()
                        +"\t\t\t"+books[i].getBokkDj());
            }
        }
    }
    public void getBookById(int bookId) {
        boolean flag=false;
        System.out.println("图书编号\t\t图书名称\t\t图书数量\t\t单价");
        for (int i = 0; i <books.length ; i++) {
            if(books[i]!=null) {
                if (books[i].getBookId() == bookId) {
                    System.out.println(books[i].getBookId()
                            +"\t\t\t\t"+books[i].getBookName()
                            +"\t\t"+books[i].getBookNum()
                            +"\t\t\t"+books[i].getBokkDj());
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }
}
