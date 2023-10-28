package org.example.dataAccess;

import org.example.entities.Car;

import java.util.List;

public interface CarDao {
    void addCar(Car car);
    void deleteCar(String licensePlate);
    Car findCar(String licensePlate);
    List<Car> getAllCars();
}
