package com.courses.assignment.citizen.repositories;

import com.courses.assignment.citizen.model.entities.Province;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepo {
    List<Province> getAll();
    Province getById(int id);
    void add(Province province);
    void update(Province province);
    void delete(int provinceID);
}
