package com.codegym.service.product;

import com.codegym.dao.product.CategoryDao;
import com.codegym.dao.product.ICategoryDao;
import com.codegym.dao.product.IProductDao;
import com.codegym.dao.product.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    private IProductDao productDao = new ProductDao();
    private ICategoryDao categoryDao = new CategoryDao();

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public boolean save(Product product) {
        return productDao.save(product);
    }

    @Override
    public boolean update(int id, Product product) {
        return productDao.update(id, product);
    }

    @Override
    public boolean delete(int id) {
        return productDao.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);

    }

    @Override
    public List<Product> findByName(String productName) {
        productName = "%" + productName + "%";
        return productDao.findByName(productName);
    }
}
