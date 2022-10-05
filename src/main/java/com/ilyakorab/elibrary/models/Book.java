package com.ilyakorab.elibrary.models;

public class Book {
    private int id;
    private String title;
    private String Author;
    private int year;

    public Book(){

    }

    public Book(String title, String author, int year) {
        this.title = title;
        Author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
