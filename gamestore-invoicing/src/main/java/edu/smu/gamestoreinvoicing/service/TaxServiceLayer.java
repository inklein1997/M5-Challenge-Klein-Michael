package edu.smu.gamestoreinvoicing.service;

import edu.smu.gamestoreinvoicing.model.Tax;
import edu.smu.gamestoreinvoicing.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TaxServiceLayer {

    @Autowired
    TaxRepository salesTaxRateRepository;

    Tax[] states = new Tax[]{
            new Tax("AK",new BigDecimal("0.06")),
            new Tax("AL",new BigDecimal("0.05")),
            new Tax("AR",new BigDecimal("0.06")),
            new Tax("AZ",new BigDecimal("0.04")),
            new Tax("CA",new BigDecimal("0.06")),
            new Tax("CO",new BigDecimal("0.04")),
            new Tax("CT",new BigDecimal("0.03")),
            new Tax("DE",new BigDecimal("0.05")),
            new Tax("FL",new BigDecimal("0.06")),
            new Tax("GA",new BigDecimal("0.07")),
            new Tax("HI",new BigDecimal("0.05")),
            new Tax("IA",new BigDecimal("0.04")),
            new Tax("ID",new BigDecimal("0.03")),
            new Tax("IL",new BigDecimal("0.05")),
            new Tax("IN",new BigDecimal("0.05")),
            new Tax("KS",new BigDecimal("0.06")),
            new Tax("KY",new BigDecimal("0.04")),
            new Tax("LA",new BigDecimal("0.05")),
            new Tax("MA",new BigDecimal("0.05")),
            new Tax("MD",new BigDecimal("0.07")),
            new Tax("ME",new BigDecimal("0.03")),
            new Tax("MI",new BigDecimal("0.06")),
            new Tax("MN",new BigDecimal("0.06")),
            new Tax("MO",new BigDecimal("0.05")),
            new Tax("MS",new BigDecimal("0.05")),
            new Tax("MT",new BigDecimal("0.03")),
            new Tax("NC",new BigDecimal("0.05")),
            new Tax("ND",new BigDecimal("0.05")),
            new Tax("NE",new BigDecimal("0.04")),
            new Tax("NH",new BigDecimal("0.06")),
            new Tax("NJ",new BigDecimal("0.05")),
            new Tax("NM",new BigDecimal("0.05")),
            new Tax("NV",new BigDecimal("0.04")),
            new Tax("NY",new BigDecimal("0.06")),
            new Tax("OH",new BigDecimal("0.04")),
            new Tax("OK",new BigDecimal("0.04")),
            new Tax("OR",new BigDecimal("0.07")),
            new Tax("PA",new BigDecimal("0.06")),
            new Tax("RI",new BigDecimal("0.06")),
            new Tax("SC",new BigDecimal("0.06")),
            new Tax("SD",new BigDecimal("0.06")),
            new Tax("TN",new BigDecimal("0.05")),
            new Tax("TX",new BigDecimal("0.03")),
            new Tax("UT",new BigDecimal("0.04")),
            new Tax("VA",new BigDecimal("0.06")),
            new Tax("VT",new BigDecimal("0.07")),
            new Tax("WA",new BigDecimal("0.05")),
            new Tax("WI",new BigDecimal("0.03")),
            new Tax("WV",new BigDecimal("0.05")),
            new Tax("WY",new BigDecimal("0.04"))
    };

    public Tax findTaxByState(String state) {
        return salesTaxRateRepository.findByState(state);
    }

    public void loadTaxes() {
        salesTaxRateRepository.deleteAll();
        for (Tax state : states) {
            salesTaxRateRepository.save(state);
        }

    }
}
