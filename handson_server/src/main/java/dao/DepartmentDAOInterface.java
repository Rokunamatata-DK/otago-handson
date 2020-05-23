/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Department;
import java.util.List;

/**
 *
 * @author vincenttoailoa
 */
public interface DepartmentDAOInterface {
    
    int createDepartment(Department department);

    int delete(String departmentName);

    List<Department> getDepartmentList();
    
}
