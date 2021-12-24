package com.courses.assignment.citizen.model.dto;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class A3UserDto implements Serializable {
    private Integer id;
    private String name;
    private Date birth;
    private String phone;
    private Integer districtID;
    private Integer a2Userid;
}
