package com.Finance.stock.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CompanyResponse {

    private int count;

   // private List explains;



    @JsonProperty("quotes")
    private List<CompanyQuotes> companyQuotes;

    @JsonProperty("news")
    private List<CompanyNews> companyNews;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
