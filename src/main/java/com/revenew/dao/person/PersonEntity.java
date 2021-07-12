package com.revenew.dao.person;

import org.springframework.stereotype.Service;

@Service
public interface PersonEntity {
    String getFirstName() ;
    String getLastName() ;
    String getId() ;
    String getAddress() ;
    String getMobileNumber() ;
    String getDrivingLicenseNumber() ;
}
