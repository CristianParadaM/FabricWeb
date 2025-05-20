package com.uptc.frw.fabricweb.service;

import com.uptc.frw.fabricweb.model.Person;
import com.uptc.frw.fabricweb.model.Sale;
import com.uptc.frw.fabricweb.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private PersonService personService;

    public List<Sale> findAllSale() {
        return saleRepository.findAll();
    }

    public Sale getSaleById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    public Sale saveSale(Sale sale) {
        Person person = personService.getPersonById(sale.getPersonId());
        sale.setPerson(person);
        return saleRepository.save(sale);
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    public Sale updateSale(Sale newSale) {
        Sale sale = getSaleById(newSale.getId());
        sale.setSaleDate(newSale.getSaleDate());
        sale.setEstimateDeliveryDate(newSale.getEstimateDeliveryDate());
        sale.setDeliveryDate(newSale.getDeliveryDate());
        return saleRepository.save(sale);
    }
}
