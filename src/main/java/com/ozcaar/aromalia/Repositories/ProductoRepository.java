package com.ozcaar.aromalia.Repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ozcaar.aromalia.Models.ProductoModel;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Long> {
    public abstract ArrayList<ProductoModel> findById(Integer product);
}
