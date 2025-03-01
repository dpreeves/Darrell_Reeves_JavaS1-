package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Invoice;

import java.util.List;

public interface InvoiceDao {
    Invoice addInvoice(Invoice invoice);
    Invoice getInvoice(int invoiceId);
    List<Invoice> getAllInvoices();
    void updateInvoice(Invoice invoice);
    void deleteInvoice(int invoiceId);

}
