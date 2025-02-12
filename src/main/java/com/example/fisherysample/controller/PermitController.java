package com.example.fisherysample.controller;

import com.example.fisherysample.model.Permit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.fisherysample.service.IPermitService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/permits")
public class PermitController {
    private final IPermitService service;

    @Autowired
    public PermitController(IPermitService service) {
        this.service = service;
    }

    @GetMapping
    public List<Permit> list() {
        return service.listAll();
    }

    @PostMapping
    public void add(@RequestBody Permit permit) {
        service.save(permit);
    }

    @GetMapping("/{id}")
    public Permit get(@PathVariable Long id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
