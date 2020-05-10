/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincenttoailoa
 */
public class StudentDAOTest {
    
    private StudentDAOInterface dao = new StudentDAO();
    
    private Student student1;
    private Student student2;
    private Student student3;
    
    public StudentDAOTest() {
        this.dao = new StudentDAO();
    }
    
    @Before
    public void setUp() {
        this.student1 = new Student( "user1","Green","John","Wick","yo@no.com","0293432343", "FK655", "Hillmorton", "Male");
        this.student2 = new Student( "user2","Alpha","Bob","Titilo","no@yes.com","02234334343", "JBC243", "Shirley", "Male");
        this.student3 = new Student( "user3","wendys","Jen","Lopez","lesgo@ymail.com","025849837","EZY343", "Otago", "Female");
        
        // save the students
        dao.saveStudent(student1);
        dao.saveStudent(student2);
        dao.saveStudent(student3);
    }
    
    @After
    public void tearDown() {
    }

    //@Test
    public void testGetAll() {
        
        // ensure the result includes the two saved products
        // assertTrue("student1 should exist", students.contains(student1));
        // assertTrue("student2 should exist", students.contains(student2));
        // assertTrue("student3 should exist", students.contains(student3));
      
        // ensure the result ONLY includes the two saved products
        // assertEquals("Only 3 products in result", 3, students.size());
        
        //
    }

    //@Test
    //public void testCreate() {
    //}

    @Test
    public void testGetById() {
    }

    @Test
    public void testGeyByEmail() {
    }

    @Test
    public void testGetBysUername() {
    }

    @Test
    public void testValidateCredentials() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testUpdateItem() {
    }

    @Test
    public void testExists() {
    }

    @Test
    public void testGetByEmail() {
    }
    
}
