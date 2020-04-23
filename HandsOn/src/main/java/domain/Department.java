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
public class Department {
    private String departmentName;
    private List<Application> applications;
    private String departmentID;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
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
