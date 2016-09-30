package ua.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Entity.Category;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
