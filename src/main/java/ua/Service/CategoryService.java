package ua.Service;

import ua.Entity.Category;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface CategoryService {
    void addCategory(Category category);
    List<Category> findAll();
    Category findOne(int id);
}
