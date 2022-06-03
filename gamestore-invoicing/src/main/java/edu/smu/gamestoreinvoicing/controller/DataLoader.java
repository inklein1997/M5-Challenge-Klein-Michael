package edu.smu.gamestoreinvoicing.controller;

import edu.smu.gamestoreinvoicing.model.Game;
import edu.smu.gamestoreinvoicing.service.ProcessingFeeLayer;
import edu.smu.gamestoreinvoicing.service.TaxServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataLoader {
    @Autowired
    TaxServiceLayer taxServiceLayer;

    @Autowired
    ProcessingFeeLayer processingFeeLayer;

    @PostMapping("/loadData")
    @ResponseStatus(HttpStatus.CREATED)
    public void seedData() {
        taxServiceLayer.loadTaxes();
        processingFeeLayer.loadFee();
    }
}
