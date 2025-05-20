package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Machine;
import com.uptc.frw.fabricweb.model.ProductType;
import com.uptc.frw.fabricweb.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    public List<ProductType> findAllProductType() {
        return productTypeRepository.findAll();
    }

    public ProductType getProductTypeById(Long id) {
        return productTypeRepository.findById(id).orElse(null);
    }

    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    public void deleteProductType(Long id) {
        productTypeRepository.deleteById(id);
    }

    public ProductType updateProductType(ProductType newProductType) {
        ProductType productType = getProductTypeById(newProductType.getId());
        productType.setProductType(newProductType.getProductType());
        return productTypeRepository.save(productType);
    }
}
