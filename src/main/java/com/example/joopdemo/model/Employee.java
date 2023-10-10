package com.example.joopdemo.model;


import com.example.joopdemo.dto.DepartmentDto;
import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String name;
    private String gender;
    private int age;
    private Department departmentId;
    private String address;
    private String phoneNumber;
}
