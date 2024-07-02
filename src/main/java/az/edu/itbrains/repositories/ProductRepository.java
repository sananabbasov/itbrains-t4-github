package az.edu.itbrains.repositories;

import az.edu.itbrains.models.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {

    List<Product> filterProducts();


}
