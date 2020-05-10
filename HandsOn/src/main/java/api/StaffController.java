/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.StaffService;


/**
 *
 * @author Domini
 */
@RequestMapping("api/v1/staff")
@RestController
public class StaffController {
    private final StaffService staffService;
    
    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }
    
    @GetMapping(path = "{id}")
    public Staff getStaffByID(@PathVariable("id") String id){
        return staffService.getStaffByID(id);
    }
    
    @PostMapping
    public void addStaff(@RequestBody Staff staff){
        staffService.addStaff(staff);
    }
    
    @PutMapping(path = {"id"})
    public void updateStaff(@PathVariable("id") String id, @RequestBody Staff staff){
        staffService.updateStaff(id, staff);
    }
    
    @DeleteMapping(path={"id"})
    public void deleteStaff(@PathVariable("id") String id){
        staffService.deleteStaff(id);
    }
}
