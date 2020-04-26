/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Dominic
 */
@Repository("injectStaff")
public class DBStaffJDBC implements StaffDAO{
    private String databaseURI = "database URI insert here";

    public DBStaffJDBC() {
    }

    public DBStaffJDBC(String uri) {
        this.databaseURI = uri;
    }
}
