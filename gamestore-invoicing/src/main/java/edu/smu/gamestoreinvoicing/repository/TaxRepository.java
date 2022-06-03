package edu.smu.gamestoreinvoicing.repository;

import edu.smu.gamestoreinvoicing.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
    public Tax findByState(String state);
}
