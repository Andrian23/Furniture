package ua.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.DAO.SubCategoryDao;
import ua.Entity.SubCategory;
import ua.Service.SubCategoryService;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
@Service
public class SubCategoryServiceImp implements SubCategoryService {
    @Autowired
    private SubCategoryDao subCategoryDao;

    @Override
    public void addSubCategory(SubCategory subCategory) {
        subCategoryDao.save(subCategory);
    }

    @Override
    public List<SubCategory> findAll() {
        return subCategoryDao.findAll();
    }

    @Override
    public SubCategory findOne(int id) {
        return subCategoryDao.findOne(id);
    }

    @Override
    public List<SubCategory> findSubCategoryFromCategory( int id) {
       return subCategoryDao.findSubCategoryFromCategory(id);
    }
}
