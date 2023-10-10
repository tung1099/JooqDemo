package com.example.joopdemo.mapper;

import com.example.joopdemo.dto.EmployeeDto;
import com.example.joopdemo.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class EmployeeMapper {
    @Mappings(
            value = @Mapping(source = "genderCode", target = "gender")
    )
    public abstract EmployeeDto toDto(Employee employee);
    public abstract Employee toEntity(EmployeeDto employeeDto);
}
