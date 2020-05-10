/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Dominic
 */
public class Application {
    private String studentid;
    private Department department;
    private String appNumber;


    private String description;
    private Date date;
    
    public Application(String studentid, Department department, String description, Date date) {
        this.studentid = studentid;
        this.department = department;
        this.description = description;
        this.date = date;
    }
    


    public String getStudent() {
        return studentid;
    }

    public void setStudent(String student) {
        this.studentid = student;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
