/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;

/**
 *
 * @author Domini
 */
public interface StudentDAO {
    public void save(Student student);
    public Student getStudent(String username);
    public Boolean validateCredentials(String username, String password);
}