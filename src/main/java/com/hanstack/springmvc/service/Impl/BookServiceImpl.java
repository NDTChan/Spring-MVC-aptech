package com.hanstack.springmvc.service.Impl;

import com.hanstack.springmvc.dto.BookDTO;
import com.hanstack.springmvc.model.Book;
import com.hanstack.springmvc.repository.BookRepository;
import com.hanstack.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getListBook() {
        return bookRepository.findAll();
    }
}
