/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Dominic
 */
public class Staff implements Comparable<Staff>{
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String cellNumber;
    private String gender;
    private String staffID;

    public Staff() {
        
    }

    public Staff(String username, String password, String firstName, String lastname, String email, String cellnumber, String gender, String id) {
        this.userName = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = email;
        this.cellNumber = cellnumber;
        this.gender = gender;
        this.staffID = id;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Staff(String firstName, String lastName, String email, String cellNumber, String staffID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellNumber = cellNumber;
        this.staffID = staffID;
    }

    @Override
    public int compareTo(Staff o) {
        return this.email.compareTo(o.getEmail());
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void add(Staff staff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
