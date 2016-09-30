package ua.Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yaromyryaremko on 15.09.16.
 */

@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String goodsCode;

    @Column
    private String goodsPictures;

    @ManyToOne(fetch = FetchType.LAZY)
    private SubCategory subCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;



    public Goods(){
    }

    public Goods(String name, String goodsCode, SubCategory subCategory, Brand brand) {
        this.name = name;
        this.goodsCode = goodsCode;
        this.subCategory = subCategory;
        this.brand = brand;
    }

    public String getGoodsPictures() {
        return goodsPictures;
    }

    public void setGoodsPictures(String goodsPictures) {
        this.goodsPictures = goodsPictures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
