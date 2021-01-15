package com.bootcamp.vehicles.service;

import com.bootcamp.vehicles.entity.Vehicles;
import com.bootcamp.vehicles.repository.VehiclesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VehiclesService {

    private final VehiclesRepository vehiclesRepository;

    public Vehicles create(Vehicles vehicles) {
        return vehiclesRepository.save(vehicles);
    }

    public List<Vehicles> list() {
        return vehiclesRepository.findAll();
    }

    public Vehicles listById(Long id) {
        return vehiclesRepository.findById(id);
    }

    public Vehicles update(Vehicles vehicles) {
        return vehiclesRepository.update(vehicles);
    }

    public void delete(Long id) {
        vehiclesRepository.delete(id);
    }
}
