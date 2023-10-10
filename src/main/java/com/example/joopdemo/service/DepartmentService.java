package com.example.joopdemo.service;

import com.example.joopdemo.dto.DepartmentDto;
import com.example.joopdemo.dto.EmployeeDto;
import com.example.joopdemo.mapper.DepartmentMapper;
import com.example.joopdemo.model.Employee;
import org.jooq.DSLContext;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
//    private final DSLContext dslContext;
//    private final DepartmentMapper departmentMapper;

//    @Autowired
//    public DepartmentService(DSLContext dslContext, DepartmentMapper departmentMapper) {
//        this.dslContext = dslContext;
//        this.departmentMapper = departmentMapper;
//    }
//
//    public DepartmentDto getDepartmentById(Long id) {
//        // Sử dụng Jooq để truy vấn cơ sở dữ liệu và ánh xạ kết quả sang DTO
//        DepartmentDto department = dslContext.selectFrom(DEPARTMENT)
//                .where(DEPARTMENT.ID.eq(id))
//                .fetchOneInto(DepartmentDto.class);
//        return departmentMapper.toDto(department);
//    }
}