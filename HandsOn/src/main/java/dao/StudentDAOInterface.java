/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.Collection;

/**
 *
 * @author vincenttoailoa
 */
public interface StudentDAOInterface {

    Student getByEmail(String email);

    Student getByStudentID(String id);

    Student getByUsername(String username);

    void saveStudent(Student student);

    void updateStudent(String id, Student updated_account);
    
    void removeStudent(Student student);

    Boolean validateCredentials(String username, String password);
    
    
}
