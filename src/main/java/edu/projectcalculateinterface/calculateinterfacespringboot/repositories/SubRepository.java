package edu.projectcalculateinterface.calculateinterfacespringboot.repositories;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Sub;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubRepository extends CrudRepository<Sub,Long> {
}
