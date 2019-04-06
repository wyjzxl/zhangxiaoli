package com.kgc.BookSystem.Opera;
import com.kgc.BookSystem.Book;
public interface OperaInterface {

    void addBook(Book book);
    void updateBook(int bookId,int bookNum);
    void deleteBook(int bookId);
    void showBookInf();
    void getBookById(int bookId);
}
