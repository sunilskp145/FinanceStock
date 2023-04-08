package com.Finance.stock.controller;

import com.Finance.stock.response.CompanyResponse;
import com.Finance.stock.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

    @Autowired
    CompanyService companyService;

    @GetMapping("financeDetail")
    public CompanyResponse companyResponse(@RequestParam String q){
        CompanyResponse companyResponse = companyService.getResponse(q);
        return companyResponse;
    }
}
