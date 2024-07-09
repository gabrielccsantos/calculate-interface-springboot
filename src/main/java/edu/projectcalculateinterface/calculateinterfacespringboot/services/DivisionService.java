package edu.projectcalculateinterface.calculateinterfacespringboot.services;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Division;
import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Operation;
import edu.projectcalculateinterface.calculateinterfacespringboot.interfaces.CalculateInterface;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DivisionService implements DivisionRepository {


    @Override
    public <S extends Division> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Division> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Division> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Division> findAll() {
        return null;
    }

    @Override
    public Iterable<Division> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Division entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Division> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
