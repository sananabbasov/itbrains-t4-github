package az.edu.itbrains.repositories;

import az.edu.itbrains.models.Category;

import java.util.List;

public interface Repository<TModel> {
    void create(TModel model);
    void update(TModel model);
    void delete(TModel model);
    TModel get(int id);
    List<TModel> findAll();
}
