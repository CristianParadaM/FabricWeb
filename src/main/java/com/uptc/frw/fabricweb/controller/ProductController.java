package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.Product;
import com.uptc.frw.fabricweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.findAllProduct();
    }
    @GetMapping("/{id}")
        public Product getProduct(@PathVariable long id){
        return productService.getProductById(id);
    }
    @PostMapping
    public Product saveProduct(@RequestBody Product Product){
        return productService.saveProduct(Product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
    }
    @PutMapping
    public Product upDateProduct(@RequestBody Product Product){
        return productService.updateProduct(Product);

    }
}
