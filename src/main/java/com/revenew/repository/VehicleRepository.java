package com.revenew.repository;

import com.revenew.dao.vehicle.jpa.VehicleEntityImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * VehicleEntityImpl repository.
 */
@Service
public interface VehicleRepository extends JpaRepository<VehicleEntityImpl,String> {
}
