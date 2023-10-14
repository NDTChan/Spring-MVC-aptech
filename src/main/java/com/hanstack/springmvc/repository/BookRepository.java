package com.hanstack.springmvc.repository;

import com.hanstack.springmvc.dto.BookDTO;
import com.hanstack.springmvc.model.Book;
import com.hanstack.springmvc.model.User;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
