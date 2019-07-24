package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.ProcessingFee;
import com.trilogy.DarrellReevesU1Capstone.model.SalesTaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class TaxFeeDaoJdbcTemplateImpl implements TaxFeeDao{

    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_SALES_TAX_SQL = "select * from sales_tax_rate where state = ?";
    private static final String SELECT_PROCESSING_FEE_SQL = "select * from processing_fee where product_type = ?";

    @Autowired
    public TaxFeeDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}

    @Override
    public SalesTaxRate getSalesTaxRate(String state) {
        try {
            return jdbcTemplate.queryForObject(SELECT_SALES_TAX_SQL, this::mapRowToSalesTax, state);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public ProcessingFee getProcessingFee(String productType) {
        try {
            return jdbcTemplate.queryForObject(SELECT_PROCESSING_FEE_SQL, this::mapRowToProcessingFee, productType);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    private SalesTaxRate mapRowToSalesTax(ResultSet rs, int rowNum) throws SQLException{

        SalesTaxRate salesTaxRate = new SalesTaxRate();

        salesTaxRate.setIxStateRate(rs.getInt("ix_state_rate"));
        salesTaxRate.setState(rs.getString("state"));
        salesTaxRate.setRate(rs.getBigDecimal("rate"));

        return salesTaxRate;
    }

    private ProcessingFee mapRowToProcessingFee(ResultSet rs, int rowNum) throws SQLException{

        ProcessingFee processingFee = new ProcessingFee();

        processingFee.setIxProductTypeFee(rs.getInt("ix_product_type_fee"));
        processingFee.setProductType(rs.getString("product_type"));
        processingFee.setFee(rs.getBigDecimal("fee"));

        return processingFee;
    }
}
