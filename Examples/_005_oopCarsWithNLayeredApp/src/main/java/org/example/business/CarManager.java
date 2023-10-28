package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager implements VehicleManager{
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao,Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void addCar(Car car) throws Exception{
        if (Integer.parseInt(car.getModelYear()) < 2000) {
            throw new Exception("Attention: This car is an old model.");
        }

        if (checkIfExist(car)){
            System.out.println("Eklemek istediğiniz "+car.getLicensePlate() +" plakalı araç sistemde kayıtlıdır.");
            System.out.println("------------------------------------------------");
        }else{
            carDao.addCar(car);
            for (Logger logger : loggers) {
                logger.addLog(car.getLicensePlate());
            }
            System.out.println("------------------------------------------------");
        }

    }


    public void deleteCar(String licensePlate) {
        carDao.deleteCar(licensePlate);
    }

    public Car findCar(String licensePlate) {
        return carDao.findCar(licensePlate);
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    public boolean checkIfExist(Car car) {
        for (Car i : carDao.getAllCars()) {
            if(car.getLicensePlate().equals(i.getLicensePlate())) {
                return true;
            }
        }
        return false;
    }

}
