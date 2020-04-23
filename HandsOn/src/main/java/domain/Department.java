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

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    private String departmentName;
    private List<Student> students;
    private List<Application> ranking;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Application> getRanking() {
        return ranking;
    }

    public void setRanking(List<Application> ranking) {
        this.ranking = ranking;
    }
}
