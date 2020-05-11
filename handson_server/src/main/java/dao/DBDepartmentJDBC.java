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
 * @author Dominic
 */

public class DBDepartmentJDBC implements DepartmentDAO{
    private String databaseURI = "database URI insert here";

    public DBDepartmentJDBC() {
    }

    public DBDepartmentJDBC(String uri) {
        this.databaseURI = uri;
    }

    @Override
    public int createDepartment(Department department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String departmentName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getDepartmentList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
