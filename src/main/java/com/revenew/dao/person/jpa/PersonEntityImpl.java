package com.revenew.dao.person.jpa;

import com.revenew.dao.person.PersonEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "PERSON")
public class PersonEntityImpl implements PersonEntity {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "DL_NUMBER")
    private String drivingLicenseNumber;
}
