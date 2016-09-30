package ua.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.Entity.Brand;
import ua.Entity.Category;
import ua.Entity.Goods;
import ua.Entity.SubCategory;
import ua.Service.Implementation.BrandServiceImp;
import ua.Service.Implementation.CategoryServiceImp;
import ua.Service.Implementation.GoodsServiceImp;
import ua.Service.Implementation.SubCategoryServiceImp;
import ua.SupportJSON.GoodsJSON;
import ua.SupportJSON.SubCategoryJSON;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.List;

/**
 * Created by yaromyryaremko on 16.09.16.
 */
@Controller
public class AdminController {
    @Autowired
    private GoodsServiceImp goodsServiceImp;
    @Autowired
    private CategoryServiceImp categoryServiceImp;
    @Autowired
    private SubCategoryServiceImp subCategoryServiceImp;
    @Autowired
    private BrandServiceImp brandServiceImp;

    @ModelAttribute("json")
    public GoodsJSON getJson(){return new GoodsJSON();}


    @RequestMapping(value = "/admin")
    public String showAdmin(Model model){
        model.addAttribute("brands",brandServiceImp.findAll());
        model.addAttribute("categories",categoryServiceImp.findAll());
        model.addAttribute("subCategory", subCategoryServiceImp.findAll());
        model.addAttribute("goods",goodsServiceImp.findAll());
        return "admin";
    }

//    @RequestMapping(value = "/add/goods",method = RequestMethod.POST)
//    public String addGoods(@ModelAttribute("json") GoodsJSON goodsJSON){
//
//        System.out.println(goodsJSON.getName());
////        SubCategory subCategory = subCategoryServiceImp.findOne(goodsJSON.getIdSubCategory());
////        Brand brand = brandServiceImp.findOne(goodsJSON.getIdBrand());
////        Goods goods = new Goods(goodsJSON.getName(),goodsJSON.getGoodsCode(),subCategory,brand);
////        goodsServiceImp.addGoods(goods);
//        return "redirect:/admin";
//    }

    @RequestMapping(value = "/add/category",method = RequestMethod.POST)
    public  String addCategory(@RequestBody Category category){
        categoryServiceImp.addCategory(category);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/add/subcategory",method = RequestMethod.POST)
    public @ResponseBody SubCategoryJSON  addSubCategory(@RequestBody SubCategoryJSON subCategoryJSON){
        Category category =categoryServiceImp.findOne(subCategoryJSON.getIdCategory());
        SubCategory subCategory = new SubCategory(subCategoryJSON.getName(),category);
        subCategoryServiceImp.addSubCategory(subCategory);
        return subCategoryJSON;
    }

    @RequestMapping(value = "/add/brand",method = RequestMethod.POST)
    public  String addBrand(@RequestBody Brand brand){
        brandServiceImp.addBrand(brand);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/subCategory/{id}.json")
    public @ResponseBody List<SubCategory> ajaxMethod1(@PathVariable int id){
        List<SubCategory> list = subCategoryServiceImp.findSubCategoryFromCategory(id);
        return list;
    }

//    @RequestMapping(value = "/add/goods" ,method = RequestMethod.POST)
//    public HttpStatus test( GoodsJSON goodsJSON){
//        System.out.println(goodsJSON.getImage().getOriginalFilename());
//        return HttpStatus.OK;
//
//    }
//    @RequestMapping(value = "/test/img" ,method = RequestMethod.POST)
//    public String test(@RequestBody MultipartFile mul){
//        System.out.println(mul.getOriginalFilename());
//        return "redirect:/admin";
//
//    }
    @RequestMapping(value = "/test/img" ,method = RequestMethod.POST)
    public String test(@RequestBody MultipartFile mul, String name,String code,String idSubCategory,String idBrand) throws IOException{
        int idSubCat = Integer.parseInt(idSubCategory);
        int idBran = Integer.parseInt(idBrand);
        Goods goods = new Goods(name,code,subCategoryServiceImp.findOne(idSubCat),brandServiceImp.findOne(idBran));
        goodsServiceImp.saveAndFlash(goods);
        goodsServiceImp.saveFile(mul,String.valueOf(goods.getId()));
        return "redirect:/admin";

}


}
