package az.edu.itbrains;

import az.edu.itbrains.models.Category;
import az.edu.itbrains.models.Product;
import az.edu.itbrains.repositories.CategoryRepository;
import az.edu.itbrains.repositories.OrderRepository;
import az.edu.itbrains.repositories.impls.OrderRepositoryImpl;
import az.edu.itbrains.repositories.impls.PlCategoryRepositoryImpl;
import az.edu.itbrains.repositories.impls.TxtCategoryRepositoryImpl;
import az.edu.itbrains.services.Test;

import java.util.ArrayList;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Product phone = new Product();



        List<Product> products = new ArrayList<>();

        Category category = new Category();

//        String[] students = {"Zaur", "Sebuhi", "Sanan", "Ayxan","Elvin"};

//        List<String> students = new ArrayList<>();
//
//        students.add("Nihad");
//        students.add("Rehman");

//        CategoryRepository categoryRepository = new TxtCategoryRepositoryImpl();
//
//        categoryRepository.create(category);


        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.create(null);

    }

}