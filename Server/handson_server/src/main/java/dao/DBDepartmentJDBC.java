/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

;

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
}


