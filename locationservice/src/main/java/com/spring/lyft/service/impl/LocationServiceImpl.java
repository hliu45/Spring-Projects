package com.spring.lyft.service.impl;

import com.spring.lyft.model.Location;
import com.spring.lyft.model.LocationRepository;
import com.spring.lyft.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by teacher on 3/16/17.
 */

@Service
public class LocationServiceImpl implements LocationService{

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> saveCarLocations(List<Location> carLocations) {
        return locationRepository.save(carLocations);
    }

    @Override
    public void deleteAll() {
        this.locationRepository.deleteAll();
    }

    @Override
    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable) {
        return this.locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType), pageable);
    }

    @Override
    public Page<Location> findByVin(String vin, Pageable pageable) {
        return locationRepository.findByUnitInfoUnitVin(vin, pageable);
    }
}
