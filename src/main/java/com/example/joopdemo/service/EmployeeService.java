package com.example.joopdemo.service;

import com.example.joopdemo.dto.EmployeeDto;
import com.example.joopdemo.mapper.EmployeeMapper;
import com.example.joopdemo.model.Employee;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tables.employees_database.tables.Employees;

import java.util.Map;


@Service
public class EmployeeService {
    @Autowired
     DSLContext dslContext;
    @Autowired
     EmployeeMapper employeeMapper;


    public EmployeeDto getEmployeeById(Long id) {
        // Sử dụng Jooq để truy vấn cơ sở dữ liệu và ánh xạ kết quả sang DTO
        Employee employee = dslContext.selectFrom(Employees.EMPLOYEES)
                .where(Employees.EMPLOYEES.ID.eq(id))
                .fetchOneInto(Employee.class);
        return employeeMapper.toDto(employee);
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // Ánh xạ DTO thành Entity và lưu vào cơ sở dữ liệu sử dụng Jooq
        Employee employee = employeeMapper.toEntity(employeeDto);
        employee.setId(null); // Đảm bảo rằng ID mới sẽ được tạo khi chèn vào cơ sở dữ liệu
        employee = dslContext.insertInto(Employees.EMPLOYEES)
                .set((Map<?, ?>) employee)
                .returning()
                .fetchOne()
                .into(Employee.class);
        return employeeMapper.toDto(employee);
    }
}
