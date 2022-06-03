package edu.smu.gamestoreinvoicing.service;

import edu.smu.gamestoreinvoicing.model.Invoice;
import edu.smu.gamestoreinvoicing.model.ProcessingFee;
import edu.smu.gamestoreinvoicing.repository.ProcessingFeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProcessingFeeLayer {
    @Autowired
    ProcessingFeeRepository processingFeeRepository;

    public ProcessingFee findProcessingFee(Invoice invoice) {
        return processingFeeRepository.findByProductType(invoice.getItemType());
    }

    public void loadFee(){
        processingFeeRepository.deleteAll();
        processingFeeRepository.save(new ProcessingFee("Consoles", new BigDecimal(14.99)));
        processingFeeRepository.save(new ProcessingFee("T-shirts", new BigDecimal(1.98)));
        processingFeeRepository.save(new ProcessingFee("Games", new BigDecimal(1.49)));
    }
}
