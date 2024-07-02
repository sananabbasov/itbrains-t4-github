package az.edu.itbrains.repositories.impls;

import az.edu.itbrains.models.Category;
import az.edu.itbrains.repositories.CategoryRepository;

import java.util.List;

public class TxtCategoryRepositoryImpl implements CategoryRepository {

    @Override
    public void create(Category category) {
        System.out.println("Category added to txt");
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }
}
