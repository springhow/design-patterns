package com.springhow.designpatterns.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Book implements Cloneable {
    public static final Logger logger = LoggerFactory.getLogger(Book.class);

    private final String title;
    private final String isbn;

    public Book(String title, String isbn) throws InterruptedException {
        this.title = title;
        this.isbn = isbn;
        logger.info("Waiting 5 seconds simulate Book authoring..!");
        Thread.sleep(5000);
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", hashcode='" + hashCode() + '\'' +
                '}';
    }
}
