/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Student;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincenttoailoa
 */
public class Student_dao_interfaceTest {
    
    public Student_dao_interfaceTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetAll() {
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testGetById() {
    }

    @Test
    public void testGetByEmail() {
    }

    @Test
    public void testGetBysUername() {
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
    public void testValidateCredentials() {
    }

    public class Student_dao_interfaceImpl implements Student_dao_interface {

        public List<Student> getAll() {
            return null;
        }

        public void create(Student account) {
        }

        public Student getById(String id) {
            return null;
        }

        public Student getByEmail(String email) {
            return null;
        }

        public Student getBysUername(String username) {
            return null;
        }

        public void delete(String id) {
        }

        public void updateItem(String id, Student updated_account) {
        }

        public boolean exists(String id) {
            return false;
        }

        public Boolean validateCredentials(String username, String password) {
            return null;
        }
    }
    
}
