package org.example.business;

import org.example.entities.Car;

import java.util.List;

public interface VehicleManager {
    void addCar (Car car) throws Exception;
    void deleteCar(String licensePlate);
    Car findCar(String licensePlate);
    List<Car> getAllCars();
    boolean checkIfExist(Car car);
}
