package com.spring.lyft.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by teacher on 3/16/17.
 */
public interface LocationRepository extends JpaRepository<Location, Long>{
    Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType movementType, Pageable pageable);
    Page<Location> findByUnitInfoUnitVin(@Param("unitVin") String unitVin, Pageable pageable);
}
