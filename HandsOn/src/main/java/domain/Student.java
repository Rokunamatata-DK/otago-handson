/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
 
import java.util.List;
//import org.springframework.stereotype.Repository;
 
/**
 *
 * @author Dominic
 */

public class Student implements Comparable<Student>  {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String cellNumber;
    private String studentID;
    private String highSchool;
    private String gender;
    private List<Application> applications;

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Student(String userName, String password, String firstName, String lastName, String email, String cellNumber, String studentID, String highSchool, String gender) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellNumber = cellNumber;
        this.studentID = studentID;
        this.highSchool = highSchool;
        this.gender = gender;
    }
     @Override
    public int compareTo(Student o) {
        return this.email.compareTo(o.getEmail());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getCellNumber() {
        return cellNumber;
    }
 
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
 
    public String getStudentID() {
        return studentID;
    }
 
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
 
    public List<Application> getApplications() {
        return applications;
    }
 
    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
 
}

