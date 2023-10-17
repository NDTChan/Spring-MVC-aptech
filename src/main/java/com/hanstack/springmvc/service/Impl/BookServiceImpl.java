package com.hanstack.springmvc.service.Impl;

import com.hanstack.springmvc.dto.BookDTO;
import com.hanstack.springmvc.model.Book;
import com.hanstack.springmvc.model.Category;
import com.hanstack.springmvc.repository.BookRepository;
import com.hanstack.springmvc.repository.CategoryRepository;
import com.hanstack.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Book> getListBook() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void save(int categoryId, String title, float price) {
        Book book = new Book();
        book.setPrice(price);
        book.setTitle(title);
        Optional<Category> categoryOtp = categoryRepository.findById(categoryId);
        book.setCategory(categoryOtp.orElse(null));
        bookRepository.save(book);
    }
}
