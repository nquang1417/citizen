package com.courses.assignment.citizen.services;

import com.courses.assignment.citizen.model.dto.A1UserDto;
import com.courses.assignment.citizen.model.entities.A1User;
import com.courses.assignment.citizen.model.register.A1Register;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface A1Service {
    List<A1UserDto> getAll();
    A1UserDto getById(String id);
    void createUser(A1Register register);
    void updateUser(A1User a1User);
    void deleteUser(String id);
}
