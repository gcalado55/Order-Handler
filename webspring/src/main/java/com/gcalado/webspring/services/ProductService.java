package com.gcalado.webspring.services;

import com.gcalado.webspring.entities.Product;
import com.gcalado.webspring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> productObj = repository.findById(id);
        return productObj.get();
    }

}
