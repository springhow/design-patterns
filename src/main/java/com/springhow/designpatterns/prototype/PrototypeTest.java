package com.springhow.designpatterns.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeTest {
    public static final Logger logger = LoggerFactory.getLogger(PrototypeTest.class);

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        logger.info("Creating first book manually using constructor....!");
        Book book = new Book("HHH", "YYYY");
        logger.info("Original : {}",book);
        logger.info("Now cloning the book...!");
        Book clone = book.clone();
        logger.info("Cloned : {}",clone);
        logger.info("Cloned book has less creation time...!");

    }
}
