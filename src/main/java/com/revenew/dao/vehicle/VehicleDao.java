package com.revenew.dao.vehicle;

import com.revenew.dao.vehicle.jpa.VehicleEntityImpl;
import com.revenew.exception.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Dao for Vehicle.
 */
@Service
public interface VehicleDao {
    /**
     *  Add vehicle.
     * @param vehicleEntity
     */
    void add(VehicleEntityImpl vehicleEntity)throws ServiceException;

    /**
     * Update Vehicle.
     * @param vehicleEntity
     */
    void update(VehicleEntityImpl vehicleEntity)throws ServiceException;

    /**
     * List All Vehicles.
     * @return
     */
    List<VehicleEntityImpl> listAll()throws ServiceException;

    /**
     * List Vehicle By id.
     * @param id
     * @return
     */
    Optional<VehicleEntityImpl> listById(String id)throws ServiceException;
}
