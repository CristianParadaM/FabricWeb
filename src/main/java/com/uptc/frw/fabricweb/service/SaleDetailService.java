package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Product;
import com.uptc.frw.fabricweb.model.Sale;
import com.uptc.frw.fabricweb.model.SaleDetail;
import com.uptc.frw.fabricweb.model.key.SaleDetailKey;
import com.uptc.frw.fabricweb.repository.SaleDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDetailService {
    @Autowired
    private SaleDetailRepository saleDetailRepository;
    @Autowired
    private SaleService saleService;
    @Autowired
    private ProductService productService;

    public List<SaleDetail> findAllSaleDetail() {
        return saleDetailRepository.findAll();
    }

    public SaleDetail getSaleDetailById(SaleDetailKey id) {
        return saleDetailRepository.findById(id).orElse(null);
    }

    public SaleDetail saveSaleDetail(SaleDetail saleDetail) {
        Sale sale = saleService.getSaleById(saleDetail.getId().getSaleId());
        Product product = productService.getProductById(saleDetail.getId().getProductId());
        saleDetail.setSale(sale);
        saleDetail.setProduct(product);
        return saleDetailRepository.save(saleDetail);
    }

    public void deleteSaleDetail(SaleDetailKey id) {
        saleDetailRepository.deleteById(id);
    }

    public SaleDetail updateSaleDetail(SaleDetail newSaleDetail) {
        SaleDetail saleDetail = getSaleDetailById(new SaleDetailKey(newSaleDetail.getId().getProductId(), newSaleDetail.getId().getSaleId()));
        saleDetail.setQuantity(newSaleDetail.getQuantity());
        saleDetail.setPrice(newSaleDetail.getPrice());
        return saleDetailRepository.save(saleDetail);
    }
}
