package com.spring.lyft.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by teacher on 3/16/17.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Embeddable
public class UnitInfo {
    private final String unitVin;
    private String engineMake;
    private String driverName;
    private String unitNumber;

    private UnitInfo() {
        this.unitVin = "";
    }
}
