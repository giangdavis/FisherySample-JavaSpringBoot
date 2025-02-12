package com.example.fisherysample.service;

import com.example.fisherysample.model.Permit;

import java.util.List;

public interface IPermitService {
    List<Permit> listAll();
    void save(Permit permit);
    Permit get(Long id);
    void delete(Long id);
}
