package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Invoice;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InvoiceDaoJdbcTemplateImpl implements InvoiceDao{
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_INVOICE_SQL = "insert into invoice (name, street, city, state, zipcode," +
            "item_type, item_id, unit_price, quantity, subtotal, tax, processing_fee, total) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_INVOICE_SQL = "select * from invoice where invoice_id = ?";
    private static final String SELECT_ALL_INVOICES_SQL = "select * from invoice";
    private static final String UPDATE_INVOICE_SQL = "update invoice set name = ?, street = ?, city = ?, state = ?, zipcode = ?, " +
            "item_type = ?, item_id = ?, unit_price = ?, quantity = ?, subtotal = ?, tax = ?, processing_fee = ?, total = ? where invoice_id = ?";
    private static final String DELETE_INVOICE_SQL = "delete from invoice where invoice_id = ?";


    @Override
    @Transactional
    public Invoice addInvoice(Invoice invoice) {
        jdbcTemplate.update(
                INSERT_INVOICE_SQL,
                invoice.getName(),
                invoice.getStreet(),
                invoice.getCity(),
                invoice.getState(),
                invoice.getZipcode(),
                invoice.getItemType(),
                invoice.getItemId(),
                invoice.getUnitPrice(),
                invoice.getQuantity(),
                invoice.getSubtotal(),
                invoice.getTax(),
                invoice.getProcessingFee(),
                invoice.getTotal());

        int invoiceId = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        invoice.setInvoiceId(invoiceId);

        return invoice;
    }

    @Override
    public Invoice getInvoice(int invoiceId) {
        try {
            return jdbcTemplate.queryForObject(SELECT_INVOICE_SQL, this::mapRowtoInvoice, invoiceId);

        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Invoice> getAllInvoices() {
        try {
            return jdbcTemplate.query(SELECT_ALL_INVOICES_SQL, this::mapRowtoInvoice);
        } catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        jdbcTemplate.update(
                UPDATE_INVOICE_SQL,

                invoice.getName(),
                invoice.getStreet(),
                invoice.getCity(),
                invoice.getState(),
                invoice.getZipcode(),
                invoice.getItemType(),
                invoice.getItemId(),
                invoice.getUnitPrice(),
                invoice.getQuantity(),
                invoice.getSubtotal(),
                invoice.getTax(),
                invoice.getProcessingFee(),
                invoice.getTotal(),
                invoice.getInvoiceId());
    }

    @Override
    public void deleteInvoice(int invoiceId) {
        jdbcTemplate.update(DELETE_INVOICE_SQL, invoiceId);
    }

    private Invoice mapRowtoInvoice(ResultSet rs, int rowNum) throws SQLException{
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(rs.getInt("invoice_id"));
        invoice.setName(rs.getString("name"));
        invoice.setStreet(rs.getString("street"));
        invoice.setCity(rs.getString("city"));
        invoice.setState(rs.getString("state"));
        invoice.setZipcode(rs.getString("zipcode"));
        invoice.setItemType(rs.getString("item_type"));
        invoice.setItemId(rs.getInt("item_id"));
        invoice.setUnitPrice(rs.getBigDecimal("unit_price"));
        invoice.setQuantity(rs.getInt("quantity"));
        invoice.setSubtotal(rs.getBigDecimal("subtotal"));
        invoice.setTax(rs.getBigDecimal("tax"));
        invoice.setProcessingFee(rs.getBigDecimal("processing_fee"));
        invoice.setTotal(rs.getBigDecimal("total"));

        return invoice;
    }
}

