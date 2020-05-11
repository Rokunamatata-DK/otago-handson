/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import domain.Student;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

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

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        this.studentOne = new Student("James", "pass1", "Jamie", "Roberts", "vinny@gmail.com", "023040432", "4K", "Hillmorton", "Male");
        this.studentTwo = new Student("John", "pass2", "John", "Wick", "wick@gmail.com", "023044444", "43K", "Shirley", "Male");
        this.studentThree = new Student("Jemma", "pass3", "Jem", "Lofi", "jemjem@gmail.com", "023331232", "2770One", "Villa Maria", "Female");
    
        // save the students
        dao.saveStudent(studentOne,studentOne.getEmail());
        dao.saveStudent(studentTwo,studentTwo.getEmail());
        dao.saveStudent(studentThree, studentThree.getEmail());
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
        dao.saveStudent(studentOne,"vinny@gmail.com");
        
        // ensure that the data store includes the student
        assertTrue("Ensure that the student was saved", dao.getAll().contains(studentOne));
        //assertTrue("Ensure that the student was saved", dao.getByUsername("James"));
        
    }
    
    @Test
    public void testGetByStudentID() {
        // fail("Not implemented yet");
        dao.getById(studentOne.getStudentID());
        dao.getById(studentTwo.getStudentID());
        
        dao.getById(studentOne.getStudentID());
      
        // ensure the result includes the two saved products
        assertTrue("studentOne should exist", dao.getAll().contains(studentOne));
        assertTrue("studentTwo should exist", dao.getAll().contains(studentTwo));
      
        // ensure the result ONLY includes the two saved products
        assertEquals("Only 2 products in result", 2, dao.getAll().size());
    }

//    @Test
//    public void testGetByEmail() {
//    }
//
//    @Test
//    public void testGetByUsername() {
//    }
//
//    @Test
//    public void testUpdateStudent() {
//    }
//
//    @Test
//    public void testValidateCredentials() {
//    }

    /**
     * Test of getAll method, of class StudentDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        StudentDAO instance = new StudentDAO();
        Collection<Student> expResult = null;
        Collection<Student> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class StudentDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        String id = "";
        StudentDAO instance = new StudentDAO();
        Student expResult = null;
        Student result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByEmail method, of class StudentDAO.
     */
    @Test
    public void testGetByEmail() {
        System.out.println("getByEmail");
        String email = "";
        StudentDAO instance = new StudentDAO();
        Student expResult = null;
        Student result = instance.getByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByUsername method, of class StudentDAO.
     */
    @Test
    public void testGetByUsername() {
        System.out.println("getByUsername");
        String username = "";
        StudentDAO instance = new StudentDAO();
        Student expResult = null;
        Student result = instance.getByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        StudentDAO instance = new StudentDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exists method, of class StudentDAO.
     */
    @Test
    public void testExists() {
        System.out.println("exists");
        String id = "";
        StudentDAO instance = new StudentDAO();
        boolean expResult = false;
        boolean result = instance.exists(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItem method, of class StudentDAO.
     */
    @Test
    public void testUpdateItem() {
        System.out.println("updateItem");
        String id = "";
        Student updated_account = null;
        StudentDAO instance = new StudentDAO();
        int expResult = 0;
        int result = instance.updateItem(id, updated_account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateCredentials method, of class StudentDAO.
     */
    @Test
    public void testValidateCredentials() {
        System.out.println("validateCredentials");
        String username = "";
        String password = "";
        StudentDAO instance = new StudentDAO();
        Boolean expResult = null;
        Boolean result = instance.validateCredentials(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStudent method, of class StudentDAO.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student student = null;
        String email = "";
        StudentDAO instance = new StudentDAO();
        int expResult = 0;
        int result = instance.saveStudent(student, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
 