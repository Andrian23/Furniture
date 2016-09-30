package ua.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.Entity.SubCategory;

import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface SubCategoryDao extends JpaRepository<SubCategory,Integer> {
    @Query("select  sc from SubCategory sc join sc.category c  where c.id=:idCategory ")
    List<SubCategory> findSubCategoryFromCategory(@Param(value = "idCategory") int id);
}