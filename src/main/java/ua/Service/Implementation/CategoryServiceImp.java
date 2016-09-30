package ua.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.DAO.CategoryDao;
import ua.Entity.Category;
import ua.Service.CategoryService;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;


    @Override
    public void addCategory(Category category) {
        categoryDao.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findOne(int id) {
        return categoryDao.findOne(id);
    }
}
