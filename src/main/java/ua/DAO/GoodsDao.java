package ua.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.Entity.Goods;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface GoodsDao extends JpaRepository<Goods,Integer> {

}
