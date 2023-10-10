package com.example.joopdemo.mapper;

import com.example.joopdemo.dto.DepartmentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDto toDto(DepartmentDto department);
}
