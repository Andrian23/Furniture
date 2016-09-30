package ua.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ua.DAO.GoodsDao;
import ua.Entity.Goods;
import ua.Service.GoodsService;

import java.io.*;
import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
@Service
public class GoodsServiceImp implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void addGoods(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    @Override
    public Goods findOne(int id) {
        return goodsDao.findOne(id);
    }

    @Override
    public void deleteGoods(int id) {
        goodsDao.delete(goodsDao.findOne(id));
    }

    @Override
    public void save(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public void saveAndFlash(Goods goods) {
        goodsDao.saveAndFlush(goods);
    }

    @Override
    public void saveFile(MultipartFile file, String id) {
        File pathToFolder = new File(System.getProperty("catalina.home")+"/files/img/");
        createFolder(pathToFolder);
        Goods good=goodsDao.findOne((Integer.parseInt(id)));
        File pathToFile= new File(pathToFolder+"/"+ good.getId()+getExpansion(file.getOriginalFilename()));
        writeFile(pathToFile,file);

        good.setGoodsPictures(good.getId()+getExpansion(file.getOriginalFilename()));
        goodsDao.save(good);

    }

    @Override
    public void createFolder(File pathToFolder) {
        if(!pathToFolder.exists())
            pathToFolder.mkdirs();
    }
    @Override
    public String getExpansion(String fileName){

        return fileName.substring(fileName.lastIndexOf('.'));
    }


    @Override
    public void writeFile(File PathToFile, MultipartFile file) {
    try(OutputStream fos = new FileOutputStream(PathToFile); BufferedOutputStream bos = new BufferedOutputStream(fos)){
        bos.write(file.getBytes(), 0, file.getBytes().length);
        bos.flush();
    }catch(IOException e){

    }
}
}
