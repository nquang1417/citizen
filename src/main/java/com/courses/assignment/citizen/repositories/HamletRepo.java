package com.courses.assignment.citizen.repositories;

import com.courses.assignment.citizen.model.entities.Hamlet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HamletRepo {
    List<Hamlet> getAllInProvince(int provinceID);
    List<Hamlet> getAllInDistrict(int districtID);
    List<Hamlet> getAllInCommune(int communeID);
    Hamlet getByID(int id);
    void add(Hamlet hamlet);
    void update(Hamlet hamlet);
    void delete(int id);
}
