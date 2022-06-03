package edu.smu.gamestoreinvoicing.repository;

import edu.smu.gamestoreinvoicing.model.ProcessingFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingFeeRepository extends JpaRepository<ProcessingFee, String> {
    public ProcessingFee findByProductType(String productType);
}
