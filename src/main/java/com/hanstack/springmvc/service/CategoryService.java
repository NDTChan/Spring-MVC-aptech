package com.hanstack.springmvc.service;

import com.hanstack.springmvc.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
}
