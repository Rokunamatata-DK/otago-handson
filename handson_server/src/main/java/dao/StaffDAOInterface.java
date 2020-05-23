/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Staff;
import java.util.List;

/**
 *
 * @author vincenttoailoa
 */
public interface StaffDAOInterface {
    
    List<Staff> getAll();

    int delete(String id);

    Staff getByEmail(String email);
    
    Staff getByID(String id);

    int saveStaff(Staff staff);
    
    
    
}
