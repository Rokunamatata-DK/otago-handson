/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Application;
import domain.Department;
import java.util.List;

/**
 *
 * @author Domini
 */
public interface DepartmentDAO {
    int createDepartment(Department department);

    int delete(String departmentName);

    boolean exists(String id);

    List<Department> getDepartmentList();

}
