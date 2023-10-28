package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        /*CarDao carDao = new JdbcCarDao();*/
        CarDao carDao = new HibernateCarDao();
        Logger[] loggers = {new DatabaseLogger(), new MailLogger()};
        CarManager carManager = new CarManager(carDao, loggers);

        // Araba bilgileri bu ksımda oluşturuluyor.
        Car car1 = new Car(1,"34TB2984","Opel","Vectra","2001",400000);
        Car car2 = new Car(2,"34VVA0024","Peugeot","508","2023",1800000);
        Car car3 = new Car(3,"53TC5353","Mercedes-Benz","E200","2023",2800000);
        Car car4 = new Car(4,"34KAR0101","Renault","Megane","2021",1700000);

        System.out.println("------------------ARABA EKLEME-------------------");
        // Oluşturulan arabalar bu komutlar ile veritabanına ekleniyor.
        carManager.addCar(car1);
        carManager.addCar(car1);  // Tekrar aynı plakayı ekleyerek, sistemde kayıtlı olduğunun uyarısını alıyoruz.
        carManager.addCar(car3);
        carManager.addCar(car4);


        // Eklenmiş araçlar plaka no ile veritabanında aranabiliyor.
        System.out.println("-------------PLAKA İLE ARABA BULMA--------------");
        System.out.println(carManager.findCar("34TB2984") == null ? "Araç bulunamadı":"Araç bulundu.");
        System.out.println("------------------------------------------------");


        // Veritabanındaki tüm araçlar bu şekilde listelenebiliyor.
        System.out.println("-----------TÜM ARABALARIN LİSTELENMESİ----------");
        for (Car car : carManager.getAllCars()) {
            System.out.println("Marka: "+car.getBrand()+"\nModel: "+car.getModel()+"\nÜretim Yılı: "+car.getModelYear()+"\nFiyatı: "+car.getUnitPrice()+"₺\nAraç Id' si: "+car.getId()+"\nAraç Plakası: ("+car.getLicensePlate()+")");
            System.out.println("------------------------------------------------");

        }


        // Veritabanına eklenmiş araçlar plaka no ile veritabanından silinebiliyor.
        System.out.println("----------PLAKA İLE ARABA KAYIT SİLME-----------");
        carManager.deleteCar("34TB2999");
        carManager.deleteCar("34TB2984");


    }
}