/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
 
import java.util.Date;

/**
 *
 * @author Vincent Toailoa
 */

public class Student implements Comparable<Student>  {
    
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String cellNumber;
    private String id;
    private String highSchool;
    private String gender;
    private String letter;
    private Date signUpDate;

    public Date getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Student(String username, String password, String firstName, String lastName, String email, String cellNumber, String studentID, String highschool, String malefemale) {
        this.userName = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellNumber = cellNumber;
        this.id = studentID;
        this.highSchool = highschool;
        this.gender = malefemale;    
        
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
        return id;
    }
 
    public void setStudentID(String studentID) {
        this.id = studentID;
    }

    public Object getStaffID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
//        this.userName = username;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.cellNumber = cellNumber;
//        this.id = studentID;
//        this.highSchool = highschool;
//        this.gender = malefemale;    
return "student object:"+  this.userName+ this.firstName+ this.lastName+this.password;
    }
 
}

