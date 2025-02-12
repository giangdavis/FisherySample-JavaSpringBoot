package com.example.fisherysample.DTO;

public class FishingVesselDTO {
    private final String name;
    private final String licenseNumber;

    public FishingVesselDTO(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
