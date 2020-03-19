package com.isi.sagessem2gl.dao;

import com.isi.sagessem2gl.Model.Product;

import java.util.List;

public interface ProductDao {

    //creer par Sagesse DIHAMBOU M2GL

    //dans cette interface je cree mes methodes

    public List<Product> findAll();
    public Product findById(int id);
    public Product save (Product product);
}
