package edu.projectcalculateinterface.calculateinterfacespringboot.services;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Sub;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.SubRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubService implements SubRepository {

    @Override
    public <S extends Sub> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sub> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sub> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Sub> findAll() {
        return null;
    }

    @Override
    public Iterable<Sub> findAllById(Iterable<Long> longs) {
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
    public void delete(Sub entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sub> entities) {

    }

    @Override
    public void deleteAll() {

    }
}