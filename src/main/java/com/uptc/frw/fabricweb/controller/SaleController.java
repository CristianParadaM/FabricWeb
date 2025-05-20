package com.uptc.frw.fabricweb.controller;

import com.uptc.frw.fabricweb.model.Sale;
import com.uptc.frw.fabricweb.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.findAllSale();
    }

    @GetMapping("/{id}")
    public Sale getSale(@PathVariable long id) {
        return saleService.getSaleById(id);
    }

    @PostMapping
    public Sale saveSale(@RequestBody Sale sale) {
        return saleService.saveSale(sale);
    }

    @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable long id) {
        saleService.deleteSale(id);
    }

    @PutMapping
    public Sale upDateSale(@RequestBody Sale sale) {
        return saleService.updateSale(sale);

    }
}
