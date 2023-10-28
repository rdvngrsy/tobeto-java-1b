package org.example.dataAccess;

import org.example.entities.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JdbcCarDao implements CarDao{
    private HashMap<String, Car> cars = new HashMap<>();


    @Override
    public void addCar(Car car) {
        cars.put(car.getLicensePlate(),car);
        System.out.println(car.getId()+" No' lu araç JDBC ile veritabanına eklendi.\n-------------------------------------------------");
        System.out.println("Marka: "+car.getBrand()+"\nModel: "+car.getModel()+"\nÜretim Yılı: "+car.getModelYear()+"\nFiyatı: "+car.getUnitPrice()+"₺\nAraç Id' si: "+car.getId()+"\nAraç Plakası: ("+car.getLicensePlate()+")");
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void deleteCar(String licensePlate) {
        if(cars.containsKey(licensePlate)){
            Car car = cars.get(licensePlate);
            cars.remove(licensePlate);
            System.out.println(car.getId()+" No' lu araç JDBC ile veritabanından silindi.\n-------------------------------------------------");
            System.out.println("Marka: "+car.getBrand()+"\nModel: "+car.getModel()+"\nÜretim Yılı: "+car.getModelYear()+"\nFiyatı: "+car.getUnitPrice()+"₺\nAraç Id' si: "+car.getId()+"\nAraç Plakası: ("+car.getLicensePlate()+")");
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------");
            System.out.println(licensePlate+" plakalı araç veritabanında bulunamadığı için silinemedi.");
            System.out.println("------------------------------------------------");

        }
    }

    @Override
    public Car findCar(String licensePlate) {
        return cars.get(licensePlate);
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars.values());
    }
}
