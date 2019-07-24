package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.ProcessingFee;
import com.trilogy.DarrellReevesU1Capstone.model.SalesTaxRate;

public interface TaxFeeDao {
    SalesTaxRate getSalesTaxRate(String state);
    ProcessingFee getProcessingFee(String productType);
}
