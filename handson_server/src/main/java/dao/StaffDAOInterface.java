/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Staff;
import domain.Student;
import java.util.List;

/**
 *
 * @author Domini
 */
public interface StaffDAOInterface {
    int saveStaff(Staff staff);

    int delete(String id);

    boolean exists(String id);

    List<Staff> getAll();

    Staff getByEmail(String email);
 
    Staff getById(String id);
 
    Staff getByUsername(String username);

    int updateItem(String id, Staff updated_account);

    Boolean validateCredentials(String username, String password);
}
