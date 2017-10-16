package com.coxrob.repotrade.datamodel;

import java.math.BigDecimal;

public class Trade {

    private int accountId;
    private String type;
    private BigDecimal cashAmount;
    private String cashCurrency;
    private BigDecimal bondNominal;
    private String isin;
    private BigDecimal interestRate;
    private int startDate;
    private int endDate;

    public Trade(int accountId, String type, BigDecimal cashAmount, String cashCurrency, BigDecimal bondNominal, String isin, BigDecimal interestRate, int startDate, int endDate) {
        this.accountId = accountId;
        this.type = type;
        this.cashAmount = cashAmount;
        this.bondNominal = bondNominal;
        this.isin = isin;
        this.interestRate = interestRate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getCashCurrency() {
        return cashCurrency;
    }

    public void setCashCurrency(String cashCurrency) {
        this.cashCurrency = cashCurrency;
    }

    public BigDecimal getBondNominal() {
        return bondNominal;
    }

    public void setBondNominal(BigDecimal bondNominal) {
        this.bondNominal = bondNominal;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
    
}
