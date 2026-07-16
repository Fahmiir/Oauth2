package com.example.Oauth2.controller;

import com.example.Oauth2.entity.Book;
import com.example.Oauth2.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    BookService bookService;

    @GetMapping
    public List<Book> getBooks(){

        return bookService.findAll();

    }

}
