/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author vincenttoailoa
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dao.DBStaffJDBCTest.class, dao.DBStudentJDBCTest.class, dao.ConnectionDAOTest.class, dao.StaffDAOTest.class, dao.DBDepartmentJDBCTest.class, dao.StudentDAOTest.class, dao.DepartmentDAOTest.class, dao.DBConnectionTest.class, dao.ExceptionsTest.class, dao.Student_dao_interfaceTest.class})
public class DaoSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
