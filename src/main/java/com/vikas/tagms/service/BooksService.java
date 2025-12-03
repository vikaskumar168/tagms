package com.vikas.tagms.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vikas.tagms.entity.Book;

public class BooksService {

    // List<Book> bookList = new ArrayList<>();
    Map<Long,Book> bookIdBookMap = new HashMap<>();
    Long bookId = 1L;


    // Adding single book to Inventory
    public Book addBook(String title, String authorName, Double price, Date publishDate, Long stockCount, Long pages){
        // Create Input Validation with or maybe do this in controller
        Book book = Book.builder().title(title).authorName(authorName).pages(pages).price(price).publishDate(publishDate).stockCount(stockCount).id(bookId).build();
        bookIdBookMap.put(bookId, book);
        bookId++;
        return book;
    }
    //Later create one method for adding multiple books.

    // Increasing and Decreasing Inventory.
    public int updateInventory(Long bookId, Long count){
        Book book = bookIdBookMap.get(bookId);
        book.setStockCount(book.getStockCount() + count);
        return 0;
    }

    public int removeBook(Long bookId){
        // Book book = bookIdBookMap.get(bookId);
        bookIdBookMap.remove(bookId);
        return 0;
    }

    public Double getBooksPrice(List<Long>bookIdList){

        Double totalAmount = 0.0;
        for (Long bookId : bookIdList) {
            totalAmount += bookIdBookMap.get(bookId).getPrice();
        }
        return totalAmount;
    }

}
