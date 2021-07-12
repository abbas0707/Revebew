package com.revenew.dao.vehicle;

import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Generalized Interface for Vehicle.
 */
@Service
public interface VehicleEntity extends Serializable {
     String getRegistrationNumber() ;

     String getModalYear() ;

     String getBrandName() ;

     String getVehicleName() ;

     String getColor() ;

     String getWeight() ;

     String getPersonId() ;
}
