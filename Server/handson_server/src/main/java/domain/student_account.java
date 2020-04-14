/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Derek Zou
 */
public class student_account implements Comparable<student_account> {
   
    // private String ID;

    private String email;
    private String first_name;
    private String last_name;
    private String high_school;
    private String gender;

    
    
   
//    public student_account(String email,  String first_name, String last_name, String group, String uri) {
//        this.email = email;
//        this.user_name = user_name;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.group = group;
//        this.uri = uri;
//    }

    public student_account(String email, String first_name, String last_name, String high_school, String gender) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.high_school = high_school;
        this.gender = gender;
    }

    public student_account() {
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getHigh_school() {
        return high_school;
    }

    public String getGender() {
        return gender;
    }

   

//    public String getID() {
//        return ID;
//    }
    public String getLast_name() {
        return last_name;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setHigh_school(String high_school) {
        this.high_school = high_school;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   
//    public void setID(String ID) {
//        this.ID = ID;
//    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    

   

    @Override
    public String toString() {
        return "Custumer Account: " + " first name=" + first_name; //To change body of generated methods, choose Tools | Templates.
    }

//    public int compareTo(Account compare){
//        return this.email.compareTo(compare.getEmail());
//    }
    @Override
    public int compareTo(student_account o) {
        return this.email.compareTo(o.getEmail());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

