/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domini
 */
public class ApplicationJDBC implements ApplicationDAO{
    private String databaseURI = "database URI insert here";

    public ApplicationJDBC() {
    }

    public ApplicationJDBC(String uri) {
        this.databaseURI = uri;
    }
    @Override
    public List<domain.Application> getAllByDepartment(String department) {
        String sql = "SELECT * FROM Application WHERE departmentid = ?";
        List<Application> list = new ArrayList<>();
        try (
            Connection dbCon = DBConnection.getConnection(databaseURI);
            PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, department);
            ResultSet rs = stmt.executeQuery();
 
            while (rs.next()) {
                Application a = new Application
                (rs.getString("studentid"), rs.getString("departmentid"), rs.getString("rank"),
                rs.getString("description"), rs.getDate("date"));
                list.add(a);
            }
            } catch (SQLException ex) {
                throw new Exceptions(ex.getMessage(), ex);
            }
        return list;
    }


    @Override
    public int addApplication(domain.Application application) {
           String sql = "INSERT INTO application (studentid, departmentid, rank, description, date) VALUES (?, ?, ?, ?, ?)";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, application.getStudentid());
            stmt.setString(2, application.getDepartment());
            stmt.setString(3, application.getRanking());
            stmt.setString(4, application.getDescription());
            stmt.setDate(5, application.getDate());

            
 
            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 1;
    }


    @Override
    public int removeApplication(String studentid) {

        String sql = "delete from application where studentid = ?";

        try (
            // get a connection to the database
            Connection dbCon = DBConnection.getConnection(databaseURI);

            // create the statement
            PreparedStatement stmt = dbCon.prepareStatement(sql);
        ) {

            stmt.setString(1, studentid);
            // execute the query
            int rs = stmt.executeUpdate();

            return 1;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    @Override
    public int getRankedApplication(String department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateApplication(Application application) {
        removeApplication(application.getStudentid());
        addApplication(application);
    }
    
}
