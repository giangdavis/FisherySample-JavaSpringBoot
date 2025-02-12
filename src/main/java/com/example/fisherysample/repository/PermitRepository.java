package com.example.fisherysample.repository;

import com.example.fisherysample.model.Permit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermitRepository extends JpaRepository<Permit, Long> {
}
