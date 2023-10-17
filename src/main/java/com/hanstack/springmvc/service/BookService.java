package com.hanstack.springmvc.service;

import com.hanstack.springmvc.dto.BookDTO;
import com.hanstack.springmvc.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getListBook();

    void delete(int id);

    void save(int categoryId, String title, float price);
}
