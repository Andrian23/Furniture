package ua.SupportJSON;

import ua.Entity.SubCategory;

/**
 * Created by yaromyryaremko on 18.09.16.
 */
public class SubCategoryJSON {
    private int idCategory;

    private String name;

    public SubCategoryJSON() {
    }

    public SubCategoryJSON(int idCategory, String name) {
        this.idCategory = idCategory;
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
