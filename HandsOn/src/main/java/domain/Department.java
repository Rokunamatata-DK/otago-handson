/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Dominic
 */
public class Department implements Comparable<Department>{
    private String departmentName;
    private List<Application> applications;
    private String departmentID;

    
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
     @Override
    public int compareTo(Department o) {
        return this.departmentID.compareTo(o.getDepartmentName());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public List<Application> getRanking() {
        return applications;
    }

    public void setRanking(List<Application> ranking) {
        this.applications = ranking;
    }
}
