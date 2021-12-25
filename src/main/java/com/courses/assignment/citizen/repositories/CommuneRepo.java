package com.courses.assignment.citizen.repositories;

import com.courses.assignment.citizen.model.entities.Commune;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommuneRepo {
    List<Commune> getAllInProvince(int provinceID);
    List<Commune> getAllInDistrict(int districtID);
    Commune getById(int id);
    void add(Commune commune);
    void update(Commune commune);
    void delete(int id);
}
