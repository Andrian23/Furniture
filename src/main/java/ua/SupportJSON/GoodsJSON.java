package ua.SupportJSON;


import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yaromyryaremko on 18.09.16.
 */
public class GoodsJSON {
    private String name;
    private String goodsCode;
    private int idSubCategory;
    private int idBrand;
    private MultipartFile image;

    public GoodsJSON() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public int getIdSubCategory() {
        return idSubCategory;
    }

    public void setIdSubCategory(int idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
