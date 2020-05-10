/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincenttoailoa
 */
public class StudentDAOTest {
    
    // Create a StudentDAO Object for testing
    private StudentDAOInterface dao = new StudentDAO();
    
    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;
    
    public StudentDAOTest() {
        this.dao = new StudentDAO();
    }
    
    @Before
    public void setUp() {
        this.studentOne = new Student("James", "pass1", "Jamie", "Roberts", "vinny@gmail.com", "023040432", "4K", "Hillmorton", "Male");
        this.studentTwo = new Student("John", "pass2", "John", "Wick", "wick@gmail.com", "023044444", "43K", "Shirley", "Male");
        this.studentThree = new Student("Jemma", "pass3", "Jem", "Lofi", "jemjem@gmail.com", "023331232", "2770One", "Villa Maria", "Female");
    
        // save the students
        dao.saveStudent(studentOne);
        dao.saveStudent(studentTwo);
        dao.saveStudent(studentThree);
    }
    
    @After
    public void tearDown() {
        dao.delete(studentOne.getStudentID());
        dao.delete(studentTwo.getStudentID());
        dao.delete(studentThree.getStudentID());
        
    }

    @Test
    public void testsaveStudent() {
        
        // save the student using the DAO
        dao.saveStudent(studentOne);
        
        // ensure that the data store includes the student
        assertTrue("Ensure that the student was saved", dao.getAll().contains(studentOne));
       //assertTrue("Ensure that the student was saved", dao.getByUsername("James"));
        
    }
    

    @Test
    public void testGetByStudentID() {
    }

    @Test
    public void testGetByEmail() {
    }

    @Test
    public void testGetByUsername() {
    }

    @Test
    public void testUpdateStudent() {
    }

    @Test
    public void testValidateCredentials() {
    }
    
}
