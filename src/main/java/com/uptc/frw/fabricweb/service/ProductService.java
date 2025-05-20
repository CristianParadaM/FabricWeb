package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Product;
import com.uptc.frw.fabricweb.model.ProductType;
import com.uptc.frw.fabricweb.repository.ProductRepository;
import com.uptc.frw.fabricweb.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductTypeService productTypeService;

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(Long id){
         return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct (Product product){
        ProductType productType = productTypeService.getProductTypeById(product.getProductTypeId());
        product.setProductType(productType);
        return productRepository.save(product);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
    public  Product updateProduct(Product newProduct){
        Product product = getProductById(newProduct.getId());
        product.setName(newProduct.getName());
        product.setDescription(newProduct.getDescription());
        return  productRepository.save(product);
    }
}
