/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Application;
import java.util.List;

/**
 *
 * @author Domini
 */
public interface ApplicationDAO {
    List<Application> getAllByDepartment(String department);
    
    List<Application> getAllByStudent(String studentId);
    
    int addApplication(Application application);
    
    int removeApplication(String studentid, String appNumber);
    
    int getRankedApplication(String department, String rank);
}
