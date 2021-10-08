package com.codegym.dao.product;


import com.codegym.dao.IGeneralDao;
import com.codegym.model.Product;

import java.util.List;

public interface IProductDao extends IGeneralDao<Product> {

    @Override
    List<Product> getAll();

    @Override
    boolean save(Product product);

    @Override
    boolean update(int id, Product product);

    @Override
    boolean delete(int id);

    @Override
    Product findById(int id);
}
