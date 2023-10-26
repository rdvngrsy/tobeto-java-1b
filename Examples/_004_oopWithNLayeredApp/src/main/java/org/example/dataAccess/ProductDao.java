package org.example.dataAccess;

import org.example.entities.Product;

//Diğer Class lar bu interface' i implements edicek ve bu interface' in kurallarına uyacak.

public interface ProductDao {
    void add(Product product);
}
