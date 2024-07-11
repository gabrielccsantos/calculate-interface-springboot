package edu.projectcalculateinterface.calculateinterfacespringboot.repositories;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Sum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SumRepository extends CrudRepository<Sum, Long> {
}
