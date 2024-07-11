package edu.projectcalculateinterface.calculateinterfacespringboot.repositories;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {
}
