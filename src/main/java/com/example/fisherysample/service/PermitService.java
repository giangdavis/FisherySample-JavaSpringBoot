package com.example.fisherysample.service;

import com.example.fisherysample.model.Permit;
import com.example.fisherysample.repository.PermitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermitService implements IPermitService {
    private PermitRepository repository;

    @Autowired
    public PermitService(PermitRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Permit> listAll() {
        return repository.findAll();
    }

    @Override
    public void save(Permit permit) {
        repository.save(permit);
    }

    @Override
    public Permit get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}