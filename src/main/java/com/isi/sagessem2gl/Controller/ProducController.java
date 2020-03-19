package com.isi.sagessem2gl.Controller;

import com.isi.sagessem2gl.Model.Product;
import com.isi.sagessem2gl.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProducController  {

    @Autowired
    private ProductDao productDao;

    //Produit Methode creer par Sagesse DIHAMBOU
    @GetMapping(value = "Produits")
    public List<Product> listeProduits()
    {
        return  productDao.findAll();
    }

    //Produits/{id} creer par Sagesse DIHAMBOU
    @GetMapping(value = "Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id)
    {
        Product product = new Product(id, new String("aspirateur"), 100);
        return product;
    }
}
