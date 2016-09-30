package ua.Service;

import org.springframework.web.multipart.MultipartFile;
import ua.Entity.Goods;

import java.io.File;
import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
public interface GoodsService {
    void addGoods(Goods goods);
    List<Goods> findAll();
    Goods findOne(int id);
    void deleteGoods(int id);
    void save(Goods goods);
    void saveAndFlash(Goods goods);

    void saveFile(MultipartFile file, String id);

    void createFolder(File pathToFolder);

    void writeFile(File PathToFile, MultipartFile file);
    public String getExpansion(String fileName);
}
