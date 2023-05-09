package com.example.hibernatetest2.service;

import com.example.hibernatetest2.entity.Person;
import com.example.hibernatetest2.entity.Product;

import java.util.List;

public interface PersonProductService {
    void purchaseOfTheProductByThePersonById(Long idPerson, Long idProduct);
    List<Product> findListOfProductsByIdPerson(Long id);
    List<Person> findListOfPersonsByIdProduct(Long id);
}
