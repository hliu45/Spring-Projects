package com.spring.lyft.service;

import com.spring.lyft.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by teacher on 3/16/17.
 */
public interface LocationService {
    List<Location> saveCarLocations(List<Location> carLocations);

    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);

    Page<Location> findByVin(String vin, Pageable pageable);
}
