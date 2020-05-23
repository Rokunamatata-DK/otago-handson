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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vincenttoailoa
 */

public class DBStudentJDBC implements StudentDAOInterface {
    
    // confirm database URI
    private String databaseURI = "jdbc:h2:tcp://localhost:9092/310project"; 
    
    public DBStudentJDBC(String uri) {
        this.databaseURI = uri;
    }

    public DBStudentJDBC() {
    }
    

    @Override
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
    public Student getById(String id) {
        String sql = "SELECT * FROM Student WHERE studentid = ?";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                Student student = new Student();
                
                student.setUserName(rs.getString("username"));
                student.setPassword(rs.getString("Password"));
                student.setFirstName(rs.getString("FirstName"));
                student.setLastName(rs.getString("LastName"));
                student.setEmail(rs.getString("Email"));
                student.setCellNumber(rs.getString("CellNumber"));
                student.setStudentID(rs.getString("StudentID"));
                student.setHighSchool(rs.getString("HighSchool"));
                student.setGender(rs.getString("Gender"));
 
                return student;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }
 
   
 
    @Override
    public Student getByEmail(String email) {
        String sql = "SELECT * FROM Student WHERE email = ?";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
 
            if (rs.next()) {
                Student student = new Student();
                
                student.setUserName(rs.getString("username"));
                student.setPassword(rs.getString("Password"));
                student.setFirstName(rs.getString("FirstName"));
                student.setLastName(rs.getString("LastName"));
                student.setEmail(rs.getString("Email"));
                student.setCellNumber(rs.getString("CellNumber"));
                student.setStudentID(rs.getString("StudentID"));
                student.setHighSchool(rs.getString("HighSchool"));
                student.setGender(rs.getString("Gender"));
 
                return student;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

 
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public int updateItem(String id, Student updated_account) {
        delete(getById(id));
           String sql = "INSERT INTO Student (Username, Password, FirstName, LastName, Email, CellNumber, StudentID, HighSchool, Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
 
        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, updated_account.getUserName());
            stmt.setString(2, updated_account.getPassword());
            stmt.setString(3, updated_account.getFirstName());
            stmt.setString(4, updated_account.getLastName());
            stmt.setString(5, updated_account.getEmail());
            stmt.setString(6, updated_account.getCellNumber());
            stmt.setString(7, updated_account.getStudentID());
            stmt.setString(8, updated_account.getHighSchool());
            stmt.setString(9, updated_account.getGender());
            
            stmt.executeUpdate();
 
            return 1;
            
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    @Override
    public void delete(Student pro) {

        String sql = "delete from Product where studentid = ?";

        try (
            // get a connection to the database
            Connection dbCon = DBConnection.getConnection(databaseURI);

            // create the statement
            PreparedStatement stmt = dbCon.prepareStatement(sql);
        ) {

             stmt.setString(1, pro.getId());
            // execute the query
            int rs = stmt.executeUpdate();


        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    @Override
    public Student getStudent(String username) {
        String sql = "SELECT * FROM Student WHERE Username = ?";

        try (
                Connection dbCon = DBConnection.getConnection(databaseURI);
                PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Student student = new Student();

                student.setUserName(rs.getString("username"));
                student.setPassword(rs.getString("Password"));
                student.setFirstName(rs.getString("FirstName"));
                student.setLastName(rs.getString("LastName"));
                student.setEmail(rs.getString("Email"));
                student.setCellNumber(rs.getString("CellNumber"));
                student.setStudentID(rs.getString("StudentID"));
                student.setHighSchool(rs.getString("HighSchool"));
                student.setGender(rs.getString("Gender"));
 
                return student;
            }
            return null;
        } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
        }
    }

    @Override
    public List<Student> getListStudents(String DepartmentID) {
        List<String> studentID = new ArrayList<>();
        String sql = "SELECT * FROM Application WHERE departmentid = ?";
 
        try (
            Connection dbCon = DBConnection.getConnection(databaseURI);
            PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, DepartmentID);
            ResultSet rs = stmt.executeQuery();
 
            while (rs.next()) {
                studentID.add(rs.getString("studentid"));
                }
            } catch (SQLException ex) {
                throw new Exceptions(ex.getMessage(), ex);
            }
        List<Student> students = getStudentsID(studentID);
        return students;
    }
    
    @Override
    public List<Student> getRankedListStudents(String DepartmentID) {
        List<Student> students = new ArrayList<>();
        List<String> studentID = new ArrayList<>();
        List<String> rank = new ArrayList<>();
        String sql = "SELECT * FROM Application WHERE departmentid = ?";
 
        try (
            Connection dbCon = DBConnection.getConnection(databaseURI);
            PreparedStatement stmt = dbCon.prepareStatement(sql);) {
            stmt.setString(1, DepartmentID);
            ResultSet rs = stmt.executeQuery();
 
            while (rs.next()) {
                studentID.add(rs.getString("studentid"));
                rank.add(rs.getString("rank"));
            }
            } catch (SQLException ex) {
            throw new Exceptions(ex.getMessage(), ex);
            }
        students = getStudentsID(studentID);
        List<Student> studentsRanked = new ArrayList<>();
        
        students.add(students.get(0));
        for(int i = 1; i<rank.size(); i++){
            if (Integer.parseInt(rank.get(i-1))< Integer.parseInt(rank.get(i))){
                studentsRanked.add(i, students.get(i));
            }else{
                studentsRanked = rankStudents(rank, students, studentsRanked, i, i);
            }
        }
        return studentsRanked;
    }
    
   public List<Student> rankStudents(List<String> rank, List<Student> students,List<Student> studentsRanked, int i, int j ){
        if (Integer.parseInt(rank.get(i-1))< Integer.parseInt(rank.get(j))){
                studentsRanked.add(i, students.get(j));
            }else{
                studentsRanked = rankStudents(rank, students, studentsRanked, -i, j);
            }    
        return studentsRanked;
   }
   
   public List<Student> getStudentsID(List<String> list){
        List<Student> students = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            students.add(getById(list.get(i)));
        }
        return students;
   }
}
