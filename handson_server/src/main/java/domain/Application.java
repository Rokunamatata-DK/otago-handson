/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class Application {
    private String studentid;
    private String departmentid;
    private String ranking;
    private String status;
    private String description;
    private Date date;

    public Application(String studentid, String department, String ranking, String description, Date date) {
        this.studentid = studentid;
        this.departmentid = department;
        this.ranking = ranking;
        this.description = description;
        this.date = date;
    }

    public Application() {
    }
    
    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Application(String studentid, String department, String description, Date date) {
        this.studentid = studentid;
        this.departmentid = department;
        this.description = description;
        this.date = date;
    }
    


    public String getStudent() {
        return studentid;
    }

    public void setStudent(String student) {
        this.studentid = student;
    }

    public String getDepartment() {
        return departmentid;
    }

    public void setDepartment(String department) {
        this.departmentid = department;
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
