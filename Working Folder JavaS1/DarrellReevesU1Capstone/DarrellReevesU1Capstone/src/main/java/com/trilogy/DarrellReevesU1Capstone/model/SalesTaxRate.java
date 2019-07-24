package com.trilogy.DarrellReevesU1Capstone.model;

import java.math.BigDecimal;
import java.util.Objects;

public class SalesTaxRate {
    private int ixStateRate;
    private String state;
    private BigDecimal rate;

    public int getIxStateRate() {
        return ixStateRate;
    }

    public void setIxStateRate(int ixStateRate) {
        this.ixStateRate = ixStateRate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesTaxRate that = (SalesTaxRate) o;
        return ixStateRate == that.ixStateRate &&
                Objects.equals(state, that.state) &&
                Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ixStateRate, state, rate);
    }
}
