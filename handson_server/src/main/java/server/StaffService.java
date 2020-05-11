/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dao.StaffDAO;
import dao.StudentDAOInterface;
import domain.Staff;
import domain.Student;


/**
 *
 * @author Dominic
 */

public class StaffService {
private final StaffDAO staff;
   

   public StaffService(StaffDAO staff) {
       this.staff = staff;
   }    
   public Staff getStaffByID(String id){
       return this.staff.getById(id);
   }
   
   public int addStaff(Staff staff){
       return this.staff.saveStaff(staff);
   }
   
   public int updateStaff(String id, Staff staff){
       return this.staff.updateItem(id, staff);
   }
   
   public int deleteStaff(String id){
       return this.staff.delete(id);
   }
    
}
