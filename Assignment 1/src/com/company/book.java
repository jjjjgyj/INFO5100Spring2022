package com.company;


// Question 9
public class book {
    String name; //  "Harry Potter";
    int bookId; //  3034;
    String genre; // "Fantasy Fiction";
    double price; // 35.34d;

    public book(String name, int bookId, String genre, double price){
        this.name = name;
        this.bookId = bookId;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

