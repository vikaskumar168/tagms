package com.vikas.tagms.entity;

import java.util.Date;

import com.vikas.tagms.utils.BookType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private Long id;
    private String title;
    private Double price;
    private String authorName;
    private BookType type;
    private Date publishDate;
    private Long stockCount;
    private Long pages;//optional
}
