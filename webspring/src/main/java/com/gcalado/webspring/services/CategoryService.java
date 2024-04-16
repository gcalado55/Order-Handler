package com.gcalado.webspring.services;

import com.gcalado.webspring.entities.Category;
import com.gcalado.webspring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
     return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> categoryObj = repository.findById(id);
        return categoryObj.get();
    }

}
