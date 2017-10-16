package com.coxrob.repotrade.datamodel;

import java.math.BigDecimal;

public class Trade {

    private int accountId;
    private String type;
    private BigDecimal cashAmount;
    private BigDecimal bondNominal;
    private String isin;
    private BigDecimal interestRate;
    private int startDate;
    private int endDate;

    public Trade(int accountId, String type, BigDecimal cashAmount, BigDecimal bondNominal, String isin, BigDecimal interestRate, int startDate, int endDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        if (getAccountId() != trade.getAccountId()) return false;
        if (getStartDate() != trade.getStartDate()) return false;
        if (getEndDate() != trade.getEndDate()) return false;
        if (!getType().equals(trade.getType())) return false;
        if (!getCashAmount().equals(trade.getCashAmount())) return false;
        if (!getBondNominal().equals(trade.getBondNominal())) return false;
        if (!getIsin().equals(trade.getIsin())) return false;
        return getInterestRate().equals(trade.getInterestRate());
    }

    @Override
    public int hashCode() {
        int result = getAccountId();
        result = 31 * result + getType().hashCode();
        result = 31 * result + getCashAmount().hashCode();
        result = 31 * result + getBondNominal().hashCode();
        result = 31 * result + getIsin().hashCode();
        result = 31 * result + getInterestRate().hashCode();
        result = 31 * result + getStartDate();
        result = 31 * result + getEndDate();
        return result;
    }
}
