package com.example.fisherysample.repository;

import com.example.fisherysample.model.FishingVessel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishingVesselRepository extends JpaRepository<FishingVessel, Long> {
}
