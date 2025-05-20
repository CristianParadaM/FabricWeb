package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.ProductType;
import com.uptc.frw.fabricweb.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productType")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping
    public List<ProductType> getAllProductTypes() {
        return productTypeService.findAllProductType();
    }

    @GetMapping("/{id}")
    public ProductType getProductType(@PathVariable long id) {
        return productTypeService.getProductTypeById(id);
    }

    @PostMapping
    public ProductType saveProductType(@RequestBody ProductType productType) {
        return productTypeService.saveProductType(productType);
    }

    @DeleteMapping("/{id}")
    public void deleteProductType(@PathVariable long id) {
        productTypeService.deleteProductType(id);
    }

    @PutMapping
    public ProductType upDateProductType(@RequestBody ProductType productType) {
        return productTypeService.updateProductType(productType);

    }
}
