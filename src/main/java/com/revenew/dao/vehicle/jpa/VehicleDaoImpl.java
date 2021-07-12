package com.revenew.dao.vehicle.jpa;

import com.revenew.dao.vehicle.VehicleDao;
import com.revenew.repository.VehicleRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of VehicleDao
 */
@Component
public class VehicleDaoImpl implements VehicleDao {
    private final VehicleRepository vehicleRepository;

    /**
     * Constructor initialization.
     * @param vehicleRepository
     */
    public VehicleDaoImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void add(VehicleEntityImpl vehicleEntity) {

        this.vehicleRepository.saveAndFlush(vehicleEntity);
    }

    @Override
    public void update(VehicleEntityImpl vehicleEntity) {
        this.vehicleRepository.save(vehicleEntity);
    }

    @Override
    public List<VehicleEntityImpl> listAll() {
        return this.vehicleRepository.findAll();
    }

    @Override
    public Optional<VehicleEntityImpl> listById(String id) {
        return this.vehicleRepository.findById(id);

    }
}
