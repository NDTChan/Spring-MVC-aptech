package com.hanstack.springmvc.service.Impl;

import com.hanstack.springmvc.model.Category;
import com.hanstack.springmvc.repository.CategoryRepository;
import com.hanstack.springmvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
