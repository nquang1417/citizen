package com.courses.assignment.citizen.model.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String email;
}