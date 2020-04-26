/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebModules;

import dao.StaffDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dominic
 */
@Service
public class StaffModule {
    private final StaffDAO staffDAO;
    
    @Autowired
    public StaffModule(@Qualifier("injectStaff")StaffDAO staffDAO) {
        this.staffDAO = staffDAO;
    }
    
    
}
