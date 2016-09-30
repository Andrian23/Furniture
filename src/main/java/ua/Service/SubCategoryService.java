package ua.Service;

import ua.Entity.Category;
import ua.Entity.SubCategory;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface SubCategoryService {
    void addSubCategory(SubCategory subCategory);
    List<SubCategory> findAll();
    SubCategory findOne(int id);
    List<SubCategory> findSubCategoryFromCategory( int id);
}
