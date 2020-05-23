/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
 
import domain.Student;
import java.util.List;
 
/**
 *
 * @author vincenttoailoa
 */

public interface StudentDAOInterface {
 
    public void saveStudent(Student student);
    public Student getStudent(String username);
    public Student getById(String id);
    public Student getByEmail(String email);
    public int updateItem(String id, Student updated_account);
    public void delete(Student pro);
    public List<Student> getRankedListStudents(String DepartmentID);
    public List<Student> getListStudents(String DepartmentID);
    
}
