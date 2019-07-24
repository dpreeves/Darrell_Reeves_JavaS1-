package com.trilogy.DarrellReevesU1Capstone.controller;

import com.trilogy.DarrellReevesU1Capstone.service.InvoiceInventoryService;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Repository
@RequestMapping("/purchaseItem/{name}/{street}/{city}/{state}/{zip}/{itemType}/{itemId}/{quantity}")
public class PurchaseController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceViewModel makePurchase(@RequestBody @Valid InvoiceViewModel invoiceViewModel){
        return inventoryService.makePurchase(invoiceViewModel);
    }
}
