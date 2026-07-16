package com.example.Oauth2.service.impl;

import com.example.Oauth2.entity.Book;
import com.example.Oauth2.repository.BookRepository;
import com.example.Oauth2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {


    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
