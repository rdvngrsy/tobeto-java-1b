package springSecondApp31._workshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  // aşağıdaki değişkenlere kapsülleme yapıyor. kod kalabalığını önlüyor.Getterları yazıldı.
@Setter
@AllArgsConstructor //tüm argümanları olan ctor
@NoArgsConstructor // 0 argümanlı ctor
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

}