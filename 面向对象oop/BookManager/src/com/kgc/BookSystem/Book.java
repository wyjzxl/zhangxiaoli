package com.kgc.BookSystem;

public class Book {
    private int BookId;  //图书编号
    private String BookName;   //图书名称
    private int BookNum;  //图书数量
    private double BookDj;//图书单价

    public Book(int bookId, String bookName, int bookNum, double bookDj) {
        BookId = bookId;
        BookName = bookName;
        BookNum = bookNum;
        BookDj = bookDj;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public double getBookDj() {
        return BookDj;
    }

    public void setBookDj(double bookDj) {
        BookDj = bookDj;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookNum() {
        return BookNum;
    }

    public void setBookNum(int bookNum) {
        BookNum = bookNum;
    }

    public double getBokkDj() {
        return BookDj;
    }

    public void setBokkDj(double bokkDj) {
        BookDj = bokkDj;
    }

}
