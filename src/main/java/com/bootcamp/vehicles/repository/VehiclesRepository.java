package com.bootcamp.vehicles.repository;

import com.bootcamp.vehicles.entity.Vehicles;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VehiclesRepository {

    private final List<Vehicles> vehicles = new ArrayList<>();
    private Long lastId = 1L;

    public Vehicles save(Vehicles vehicles) {
        vehicles.setId(this.lastId);
        this.vehicles.add(vehicles);
        this.lastId++;
        return vehicles;
    }

    public List<Vehicles> findAll() {
        return this.vehicles;
    }

    public Vehicles findById(Long id) {
        for (Vehicles list : this.vehicles) {
            if (list.getId().longValue() == id) {
                return list;
            }
        }
        return null;
    }

    public Vehicles update(Vehicles vehicles) {
        for (Vehicles list : this.vehicles) {
            if (list.getId().longValue() == vehicles.getId()) {
                this.vehicles.set(this.vehicles.indexOf(list), vehicles);
            }
        }
        return vehicles;
    }

    public void delete(Long id) {
        this.vehicles.removeIf(list -> list.getId().longValue() == id);
    }
}
