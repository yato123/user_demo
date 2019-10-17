package com.qf.sell.service;

import com.qf.sell.dao.ProductCategoryDao;
import com.qf.sell.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductCategoryService
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/17
 * @Version V1.0
 **/
@Service
public class ProductCategoryService  {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    public List<ProductCategory> findAll(){
        productCategoryDao.findAll();
        return null;
    }
}
