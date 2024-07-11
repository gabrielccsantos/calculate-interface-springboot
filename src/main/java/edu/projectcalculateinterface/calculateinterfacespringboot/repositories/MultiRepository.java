package edu.projectcalculateinterface.calculateinterfacespringboot.repositories;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Multi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiRepository extends CrudRepository<Multi, Long> {
}
