package edu.projectcalculateinterface.calculateinterfacespringboot.services;

import edu.projectcalculateinterface.calculateinterfacespringboot.domain.Multi;
import edu.projectcalculateinterface.calculateinterfacespringboot.repositories.MultiRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MultiService implements MultiRepository {


    @Override
    public <S extends Multi> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Multi> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Multi> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Multi> findAll() {
        return null;
    }

    @Override
    public Iterable<Multi> findAllById(Iterable<Long> longs) {
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
    public void delete(Multi entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Multi> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
