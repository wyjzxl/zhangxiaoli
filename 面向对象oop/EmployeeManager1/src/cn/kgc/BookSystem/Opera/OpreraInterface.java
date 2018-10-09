package cn.kgc.BookSystem.Opera;

import cn.kgc.BookSystem.Book;

/**
 * Created by Administrator on 2018/9/27.
 */
public interface OpreraInterface {
    void addBook(Book book);
    void updateBook(int bookId,int bookNum);
    void deleteBook(int bookId);
    void showBookInf();
    void getBookById(int bookId);
}
