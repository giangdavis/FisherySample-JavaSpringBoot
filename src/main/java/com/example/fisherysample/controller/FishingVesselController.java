package com.example.fisherysample.controller;

import com.example.fisherysample.DTO.FishingVesselDTO;
import com.example.fisherysample.model.FishingVessel;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.fisherysample.service.IFishingVesselService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/vessels")
public class FishingVesselController {
    private final IFishingVesselService fishingVesselService;

    @Autowired
    public FishingVesselController(IFishingVesselService fishingVesselService) {
        this.fishingVesselService = fishingVesselService;
    }

    @GetMapping
    public List<FishingVesselDTO> list() {
        return fishingVesselService.listAll();
    }

    @PostMapping
    public void add(@RequestBody FishingVessel vessel) {
        fishingVesselService.save(vessel);
    }

    @GetMapping("/{licenseNumber}")
    public FishingVesselDTO get(@PathVariable String licenseNumber) {
        return fishingVesselService.getByLicenseNumber(licenseNumber);
    }

    @DeleteMapping("/{licenseNumber}")
    public void delete(@PathVariable String licenseNumber) {
        fishingVesselService.delete(licenseNumber);
    }
}
