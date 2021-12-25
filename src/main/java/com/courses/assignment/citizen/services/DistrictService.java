package com.courses.assignment.citizen.services;

import com.courses.assignment.citizen.model.entities.District;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistrictService {
    List<District> getAllInProvince(int provinceID);
    District getById(int id);
    void add(District district);
    void update(District district);
    void delete(int id);
}
