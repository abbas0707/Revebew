# Revenew
##Setup
To run a local Container, you need  following software
* Java 11+
* Git
## Assumptions
1. It is assumed that sample fields will be created for Person and Vehicle(Rego)
2. Validation on fields are not in place due to time limitation.
3. Exception handling is done but not on all scenarios. However architecture is done.

## Person
 ### Add Person
  #### Endpoint 
  http://localhost:9090/revenew/person/add
 #### Request
```
        {
             "firstName": "Alex",
             "lastName": "Roddy",
             "id": "a1deb6de-1d4f-461a-9249-829f25b964a0",
             "drivingLicenseNumber": "23456789"
         }
 ```
 ### List All Person
 #### Endpoint 
 http://localhost:9090/revenew/person/list/all
  #### Request
 ```
        {
            "persons": [
                {
                    "firstName": "Alex",
                    "lastName": "Roddy",
                    "id": "a1deb6de-1d4f-461a-9249-829f25b964a0",
                    "drivingLicenseNumber": "23456789"
                },
                {
                    "firstName": "Blex",
                    "lastName": "Roddy",
                    "id": "f31512e6-fc7b-4c22-b9c1-d4eae064ae0d",
                    "drivingLicenseNumber": "23456589"
                }
            ]
        }
  ```
 ## Vehicle
  ### Add Vehicle
   #### Endpoint 
   http://localhost:9090/revenew/vehicle/add
  #### Request
 ```
           {
                                "registrationNumber": "CIC40L1",
                                  "modalYear": "2008",
                                  "brandName": "TOYOTA",
                                  "vehicleName": "Corolla",
                                  "color": null,
                                  "weight": null,
                 }
  ```
### Update Vehicle
Use update method to Link and unlink person/vehicle.
1. To link add personId field with valid personId
2. To unlink remove personId from payload and perform update.
   #### Endpoint 
   http://localhost:9090/revenew/vehicle/update
  #### Request
 ```
           { 
                         "registrationNumber": "CIC40L1",
                        "modalYear": "2008",
                        "brandName": "TOYOTA",
                        "vehicleName": "Corolla",
                        "color": null,
                        "weight": null,
                        "personId":"743ff1ed-2106-4fee-861e-c0364f320c9e"
                 }
  ```
  ### List All Vehicle
  #### Endpoint 
  http://localhost:9090/revenew/vehicle/list/all
   #### Request
  ```
        {
            "vehicles": [
                {
                    "registrationNumber": "CIC667",
                    "modalYear": "2009",
                    "brandName": "TOYOTA",
                    "vehicleName": "Corolla"
                },
                {
                    "registrationNumber": "CIC677",
                    "modalYear": "2009",
                    "brandName": "TOYOTA",
                    "vehicleName": "Corolla",
                    "personId": "a1deb6de-1d4f-461a-9249-829f25b964a0"
                }
            ]
        }
   ```



