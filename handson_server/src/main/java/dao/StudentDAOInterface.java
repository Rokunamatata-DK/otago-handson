/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
 
import domain.Student;
import java.util.Collection;
import java.util.List;
 
/**
 *
 * @author vincenttoailoa
 */
public interface StudentDAOInterface {
 
 
    
    public  int saveStudent(Student student, String email);

    public  int delete(String email);

   public  boolean exists(String email);

   public   Collection<Student> getAll();

   public  Student getByEmail(String email);
 
    public  Student getById(String id);
 
   public  Student getByUsername(String username);

   public  int updateItem(String id, Student updated_account);

  public   Boolean validateCredentials(String username, String password);

    
}
