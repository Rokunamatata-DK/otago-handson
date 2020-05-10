/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import domain.Student;

public class DBStudentJDBC implements StudentDAOInterface {
    // confirm database URI
    private String databaseURI = "jdbc:h2:tcp://localhost:9092/310project"; 
    
    public DBStudentJDBC(){
    }

    public DBStudentJDBC(String uri) {
        this.databaseURI = uri;
    }
    public String getDatabaseURI() {
        return databaseURI;
    }
 
    public void saveStudent(Student student) {
       String sql = "INSERT INTO Student (Username, Password, FirstName, LastName, Email, CellNumber, StudentID, HighSchool, Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, student.getUserName());
            stmt.setString(2, student.getPassword());
            stmt.setString(3, student.getFirstName());
            stmt.setString(4, student.getLastName());
            stmt.setString(5, student.getEmail());
            stmt.setString(6, student.getCellNumber());
            stmt.setString(7, student.getStudentID());
            stmt.setString(8, student.getHighSchool());
            stmt.setString(9, student.getGender());
            

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Student getByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByUsername(String username) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // search for a student using the StudentID as the unique filter
        
        String sql = "SELECT * FROM Student WHERE Username = ?";

        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Student student = new Student();
                
                student.setUserName("Username");
                student.setPassword("Password");
                student.setFirstName("FirstName");
                student.setLastName("LastName");
                student.setEmail("Email");
                student.setCellNumber("CellNumber");
                student.setStudentID("StudentID");
                student.setHighSchool("HighSchool");
                student.setGender("Gender");

                return student;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }

    }

    @Override
    public void updateStudent(String id, Student updated_account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean validateCredentials(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByStudentID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
