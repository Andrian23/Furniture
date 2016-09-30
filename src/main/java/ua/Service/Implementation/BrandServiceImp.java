package ua.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.DAO.BrandDao;
import ua.Entity.Brand;
import ua.Service.BrandService;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
@Service
public class BrandServiceImp implements BrandService {
    @Autowired
    private BrandDao brandDao;


    @Override
    public void addBrand(Brand brand) {
        brandDao.save(brand);
    }

    @Override
    public Brand findOne(int id) {
        return brandDao.findOne(id);
    }

    @Override
    public List<Brand> findAll() {
        return brandDao.findAll();
    }
}
