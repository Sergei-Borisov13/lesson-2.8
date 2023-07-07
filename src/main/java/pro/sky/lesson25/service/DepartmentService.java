package pro.sky.lesson25.service;

import pro.sky.lesson25.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeMaxSalary(int departmentId);

    Employee findEmployeeMinSalary(int departmentId);

    Collection<Employee> findEmployeeByDepartment(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartment();

}
