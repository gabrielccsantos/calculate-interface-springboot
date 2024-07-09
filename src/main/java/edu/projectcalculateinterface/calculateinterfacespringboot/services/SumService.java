package edu.projectcalculateinterface.calculateinterfacespringboot.services;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Sum;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SumRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SumService implements SumRepository {

    @Override
    public <S extends Sum> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sum> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sum> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Sum> findAll() {
        return null;
    }

    @Override
    public Iterable<Sum> findAllById(Iterable<Long> longs) {
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
    public void delete(Sum entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sum> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
