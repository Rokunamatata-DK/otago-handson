/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
 
 
import dao.StudentDAOInterface;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
 
/**
 *
 * @author Dominic
 */
@Service
public class StudentService {
private final StudentDAOInterface student;
   
    @Autowired
   public StudentService(@Qualifier("injectStudent") StudentDAOInterface student) {
       this.student = student;
   }    
   public Student getStudentByID(String id){
       return this.student.getById(id);
   }
   
   public int addStudent(Student student){
       return this.student.saveStudent(student);
   }
   
   public int updateStudent(String id, Student student){
       return this.student.updateItem(id, student);
   }
   
   public int deleteStudent(String id){
       return this.student.delete(id);
   }
    
}
