package com.qf.sell.dao;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName ProductCategoryDao
 * @Description: TODO
 * @Author 陈子龙
 * @Date 2019/10/17
 * @Version V1.0
 **/@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategoryDao,Integer> {
}
