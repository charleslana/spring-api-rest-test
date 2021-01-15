package com.bootcamp.vehicles.controller;

import com.bootcamp.vehicles.entity.Vehicles;
import com.bootcamp.vehicles.service.VehiclesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bootcamp")
public class VehiclesController {

    private final VehiclesService vehiclesService;

    @PostMapping("/vehicles")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicles create(@RequestBody Vehicles vehicles) {
        return vehiclesService.create(vehicles);
    }

    @GetMapping("/vehicles")
    public List<Vehicles> list() {
        return vehiclesService.list();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicles listById(@PathVariable Long id) {
        return vehiclesService.listById(id);
    }

    @PutMapping("/vehicles")
    public Vehicles update(@RequestBody Vehicles vehicles) {
        return vehiclesService.update(vehicles);
    }

    @DeleteMapping("/vehicles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        vehiclesService.delete(id);
    }
}
