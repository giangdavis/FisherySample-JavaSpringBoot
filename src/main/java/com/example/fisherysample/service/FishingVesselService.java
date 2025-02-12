package com.example.fisherysample.service;

import com.example.fisherysample.DTO.FishingVesselDTO;
import com.example.fisherysample.model.FishingVessel;
import com.example.fisherysample.repository.FishingVesselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishingVesselService implements IFishingVesselService {
    private final FishingVesselRepository repository;

    @Autowired
    public FishingVesselService(FishingVesselRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<FishingVesselDTO> listAll() {
        List<FishingVessel> fishingVessels = repository.findAll();

        return fishingVessels.stream()
                .map(vessel -> new FishingVesselDTO(vessel.getName(), vessel.getLicenseNumber()))
                .toList();
    }

    @Override
    public void save(FishingVessel vessel) {
        repository.save(vessel);
    }

    @Override
    public FishingVesselDTO getByLicenseNumber(String licenseNumber) {
        FishingVessel fishingVessel = repository.findAll()
                .stream()
                .filter(vessel -> vessel.getLicenseNumber().equalsIgnoreCase(licenseNumber))
                .findFirst()
                .orElse(null);

        if(fishingVessel == null) return null;

        return new FishingVesselDTO(fishingVessel.getName(), fishingVessel.getLicenseNumber());
    }

    @Override
    public void delete(String licenseNumber) {
        FishingVessel fishingVessel = repository.findAll()
                .stream()
                .filter(vessel -> vessel.getLicenseNumber().equalsIgnoreCase(licenseNumber))
                .findFirst()
                .orElse(null);

        if (fishingVessel != null) {
            repository.delete(fishingVessel);
        }
    }

}
