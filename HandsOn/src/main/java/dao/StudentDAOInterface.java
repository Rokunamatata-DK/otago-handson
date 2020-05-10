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

    /**
     * Adds a account to the accounts.
     *
     * @param  The accounts being added.
     */
     //void create(Student account);
    
    int saveStudent(Student student);

    void delete(String id);

    boolean exists(String id);

    List<Student> getAll();

    Student getByEmail(String email);

    Student getByStudentID(String id);

    void updateStudent(String id, Student updated_account);
    
    void removeStudent(Student student);

    Boolean validateCredentials(String username, String password);
    
    
}
