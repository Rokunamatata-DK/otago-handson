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

/**
 *
 * @author Dominic
*/
public class DBStudentJDBC {
    // confirm database URI
    private String databaseURI = "database URI insert here";

    public DBStudentJDBC() {
    }

    public DBStudentJDBC(String uri) {
        this.databaseURI = uri;
    }

    public void save(Student student) {
        String sql = "INSERT INTO Student (Username, FirstName, LastName, Password, Email, CellNumber, StudentID) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, student.getUserName());
            stmt.setString(2, student.getFirstName());
            stmt.setString(3, student.getLastName());
            stmt.setString(4, student.getPassword());
            stmt.setString(5, student.getEmail());
            stmt.setString(6, student.getCellNumber());
            stmt.setString(7, student.getStudentID());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Student getStudent(String username) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // we can choose whether we search with Username or Student ID / Up to the group.
        String sql = "SELECT * FROM Student WHERE Username = ?";

        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Student student = new Student();
                
                student.setUserName("Username");
                student.setFirstName("FirstName");
                student.setLastName("LastName");
                student.setPassword("Password");
                student.setEmail("Email");
                student.setCellNumber("CellNumber");
                student.setStudentID("StudentID");

                return student;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    public Boolean validateCredentials(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
