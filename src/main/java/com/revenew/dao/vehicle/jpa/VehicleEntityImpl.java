package com.revenew.dao.vehicle.jpa;

import com.revenew.dao.vehicle.VehicleEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "VEHICLE")
public class VehicleEntityImpl implements VehicleEntity {


    @Id
    @Column(name="REGISTRATION_NUMBER")
    private String registrationNumber;
    @Column(name="MODAL_YEAR")
    private String modalYear;
    @Column(name="BRAND_NAME")
    private String brandName;
    @Column(name="VEHICLE_NAME")
    private String vehicleName;
    @Column(name="COLOR")
    private String color;
    @Column(name="WIGHT")
    private String weight;
    @Column(name="PERSON_ID")
    private String personId;

}
