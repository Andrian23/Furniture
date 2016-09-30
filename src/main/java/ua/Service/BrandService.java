package ua.Service;

import ua.Entity.Brand;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface BrandService {
    void addBrand(Brand brand);
    Brand findOne(int id);
    List<Brand> findAll();
}
