package com.wave.Mirissa.dtos;

import java.math.BigDecimal;

public class MonthlyRevenueDTO {
    private int month;
    private BigDecimal total;

    public MonthlyRevenueDTO(int month, BigDecimal total) {
        this.month = month;
        this.total = total;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
