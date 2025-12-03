package com.vikas.tagms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.vikas.tagms.service.BooksService;

public class BookController {

    @Autowired
    private BooksService booksService;
    // booksService.addBook

    void createBook(){
        Date publishDate = new Date();
        booksService.addBook("Pride and Prejudice", "Jane Austen", 811.78, publishDate, 7L, 279L);
    }

    
}

