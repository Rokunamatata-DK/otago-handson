/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Derek Zou
 */
public interface Student_dao_interface {

    public List<Student> getAll();

    public void create(Student account);

    public Student getById(String id);

    public Student geyByEmail(String email);

    public Student getBysUername(String username);

    public void delete(String id);

    public void updateItem(String id, Student updated_account);

    public boolean exists(String id);

    public void save(Student student);

    public Boolean validateCredentials(String username, String password);

}
