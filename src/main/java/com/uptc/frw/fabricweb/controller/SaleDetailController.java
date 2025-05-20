package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.SaleDetail;
import com.uptc.frw.fabricweb.model.key.SaleDetailKey;
import com.uptc.frw.fabricweb.service.SaleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("saleDetail")
public class SaleDetailController {
    @Autowired
    private SaleDetailService saleDetailService;

    @GetMapping
    public List<SaleDetail> getAllSaleDetails() {
        return saleDetailService.findAllSaleDetail();
    }

    @GetMapping("/{productId}/{saleId}")
    public SaleDetail getSaleDetail(@PathVariable Long productId, @PathVariable Long saleId) {
        return saleDetailService.getSaleDetailById(new SaleDetailKey(productId, saleId));
    }

    @PostMapping
    public SaleDetail saveSaleDetail(@RequestBody SaleDetail saleDetail) {
        return saleDetailService.saveSaleDetail(saleDetail);
    }

    @DeleteMapping("/{productId}/{saleId}")
    public void deleteSaleDetail(@PathVariable Long productId, @PathVariable Long saleId) {
        saleDetailService.deleteSaleDetail(new SaleDetailKey(productId, saleId));
    }

    @PutMapping
    public SaleDetail upDateSaleDetail(@RequestBody SaleDetail saleDetail) {
        return saleDetailService.updateSaleDetail(saleDetail);

    }
}
