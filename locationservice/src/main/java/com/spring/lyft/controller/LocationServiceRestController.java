package com.spring.lyft.controller;

import com.spring.lyft.model.Location;
import com.spring.lyft.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by teacher on 3/16/17.
 */

@RestController
public class LocationServiceRestController {

    private LocationService locationService;

    @Autowired
    public LocationServiceRestController(LocationService locationService) {
        this.locationService = locationService;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<Location> locations) {
        this.locationService.saveCarLocations(locations);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete() {
        this.locationService.deleteAll();
    }

    @RequestMapping(value = "/location/{movementType}", method = RequestMethod.GET)
    public Page<Location> findByMovementType(@PathVariable String movementType, @RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return this.locationService.findByVehicleMovementType(movementType, new PageRequest(page, size));
    }

    @RequestMapping(value = "/location/vin/{vin}", method = RequestMethod.GET)
    public Page<Location> findByVinNumber(@PathVariable String vin, @RequestParam(name = "page") int page, @RequestParam(name = "size") int size) {
        return this.locationService.findByVin(vin, new PageRequest(page, size));
    }
}

