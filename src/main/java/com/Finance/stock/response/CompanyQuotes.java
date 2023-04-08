package com.Finance.stock.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyQuotes {
    @JsonProperty("exchange")
    private String exchange;
    private String shortname;
    private String quoteType;
    private String symbol;
    private String index;
    private String score;
    private String typeDisp;
    private String longname;
    private String exchDisp;
    private String sector;
    private String industry;
    private String dispSecIndFlag;
    private String isYahooFinance;


    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTypeDisp() {
        return typeDisp;
    }

    public void setTypeDisp(String typeDisp) {
        this.typeDisp = typeDisp;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getExchDisp() {
        return exchDisp;
    }

    public void setExchDisp(String exchDisp) {
        this.exchDisp = exchDisp;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDispSecIndFlag() {
        return dispSecIndFlag;
    }

    public void setDispSecIndFlag(String dispSecIndFlag) {
        this.dispSecIndFlag = dispSecIndFlag;
    }

    public String getIsYahooFinance() {
        return isYahooFinance;
    }

    public void setIsYahooFinance(String isYahooFinance) {
        this.isYahooFinance = isYahooFinance;
    }
}
