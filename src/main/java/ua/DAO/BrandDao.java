package ua.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Entity.Brand;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface BrandDao extends JpaRepository<Brand,Integer> {
}
