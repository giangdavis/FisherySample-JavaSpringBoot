package com.example.fisherysample.service;

import com.example.fisherysample.DTO.FishingVesselDTO;
import com.example.fisherysample.model.FishingVessel;

import java.util.List;

public interface IFishingVesselService {
    List<FishingVesselDTO> listAll();
    void save(FishingVessel vessel);
    FishingVesselDTO getByLicenseNumber(String licenseNumber);
    void delete(String licenseNumber);
}
