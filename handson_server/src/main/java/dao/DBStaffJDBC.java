/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Staff;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dominic
 */

public class DBStaffJDBC implements StaffDAOInterface {
    private String databaseURI = "jdbc:h2:tcp://localhost:9092/310project";

    public DBStaffJDBC() {
    }

    public DBStaffJDBC(String uri) {
        this.databaseURI = uri;
    }

    @Override
    public int saveStaff(Staff staff) {
       String sql = "INSERT INTO Staff (Username, Password, FirstName, LastName, Email, CellNumber, Gender, id) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, staff.getUserName());
            stmt.setString(2, staff.getPassword());
            stmt.setString(3, staff.getFirstName());
            stmt.setString(4, staff.getLastName());
            stmt.setString(5, staff.getEmail());
            stmt.setString(6, staff.getCellNumber());
            stmt.setString(7, staff.getGender());
            stmt.setString(8, staff.getStaffID());
            
 
            stmt.executeUpdate();
 
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 1;    
    }

    @Override
    public int delete(String id) {
        String sql = "delete from staff where id = ?";
 
        try (
                // get a connection to the database
                Connection dbCon = DBConnection.getConnection(databaseURI);
 
                // create the statement
                PreparedStatement stmt = dbCon.prepareStatement(sql);
        ) {
 
             stmt.setString(1, id);
            // execute the query
            int rs = stmt.executeUpdate();
 
 
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }    
       return 1;   
    }
    
    @Override
    public Staff getByEmail(String email) {
        String sql = "SELECT * FROM staff WHERE email = ?";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                Staff staff = new Staff();
                
                staff.setUserName(rs.getString("username"));
                staff.setPassword(rs.getString("Password"));
                staff.setFirstName(rs.getString("FirstName"));
                staff.setLastName(rs.getString("LastName"));
                staff.setEmail(rs.getString("Email"));
                staff.setCellNumber(rs.getString("CellNumber"));
                staff.setGender(rs.getString("Gender"));
                staff.setStaffID(rs.getString("id"));
                return staff;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Staff> getAll() {
        
    String sql = "select * from Staff order by staffID";

    try (
        // get a connection to the database
        Connection dbCon = DBConnection.getConnection(databaseURI);

        // create the statement
        PreparedStatement stmt = dbCon.prepareStatement(sql);
    ) {
        // execute the query
        ResultSet rs = stmt.executeQuery();

        // Using a List to preserve the order in which the data was returned from the query.
        List<Staff> staff = new ArrayList<>();

        // iterate through the query results
        while (rs.next()) {

            // get the data out of the query
            String userName = rs.getString("username");
            String password = rs.getString("password");
            String firstName = rs.getString("firstname");
            String lastName = rs.getString("lastname");
            String email = rs.getString("email");
            String cellNumber = rs.getString("cellnumber");
            String gender = rs.getString("gender");
            String staffID = rs.getString("staffID");
            
            // use the data to create a staff object
            Staff s = new Staff(userName, password, firstName, lastName, email, cellNumber, gender, staffID);

            // and put it in the collection
            staff.add(s);
        }

        return staff;

    } catch (SQLException ex) {
        throw new Exceptions(ex.getMessage(), ex);
    }
    }

    @Override
    public Staff getByID(String id) {
    String sql = "SELECT * FROM staff WHERE id = ?";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                Staff staff = new Staff();
                
                staff.setUserName(rs.getString("username"));
                staff.setPassword(rs.getString("Password"));
                staff.setFirstName(rs.getString("FirstName"));
                staff.setLastName(rs.getString("LastName"));
                staff.setEmail(rs.getString("Email"));
                staff.setCellNumber(rs.getString("CellNumber"));
                staff.setGender(rs.getString("Gender"));
                staff.setStaffID(rs.getString("id"));
                return staff;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }   
    }
}
