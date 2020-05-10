/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domain.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Derek Zou
 */
public class StudentDAO implements StudentDAOInterface {
    
    //private static final Map<String, Student> accounts = new TreeMap<>();
    //private Collection<Student> accounts = new HashSet<Student>();
    //private Map<String, Student> usernameMap = new HashMap<>();
    //private static  final Map<String, Student> usernameMap = new TreeMap<>();
    
    // customers stored by username
    private static final Map<String, Student> students = new HashMap<>();
    

    public void saveStudent(Student student){
        //accounts.add(student);
        //usernameMap.put(student.getStudentID(), student);
        System.out.println("Saving student: " + student);
        students.put(student.getUserName(), student);
    }
    
    @Override
    public Student getAll() {
            return (Student) students;
    }

    /**
     * Adds a account to the accounts.
     *
     * @param  The accounts being added.
     */
    //@Override
    //public void create(Student account) {
    //        accounts.put(account.getEmail(), account);
    // }

    @Override
    public Student getById(String id) {
        return students.get(id);
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByEmail(String email){
        return students.get(email);
    }

    @Override
    public Student getByUername(String username) {
        return students.get(username);
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateItem(String id, Student updated_account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean validateCredentials(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




















































