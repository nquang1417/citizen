package com.courses.assignment.citizen.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("A1Users")
public class A1Controller {

    @Autowired
    private ModelMapper modelMapper;

}
