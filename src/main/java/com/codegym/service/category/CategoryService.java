package com.codegym.service.category;

import com.codegym.dao.product.CategoryDao;
import com.codegym.dao.product.ICategoryDao;

import java.util.List;

public class CategoryService implements ICategoryService {
    ICategoryDao categoryDao = new CategoryDao();

    @Override
    public List getAll() {
        return categoryDao.getAll();
    }

    @Override
    public boolean save(Object o) {
        return false;
    }

    @Override
    public boolean update(int id, Object o) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Object findById(int id) {
        return categoryDao.findById(id);
    }
}
