package com.example.joopdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmployeeDto {
    public Long id;
    public String name;
    @JsonProperty("genderCode")
    public String genderCode;
    public int age;
    public DepartmentDto departmentId;
    public String address;
    public String phoneNumber;
}
