/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domain.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Derek Zou
 */
@Repository("student")
public class StudentDAO implements StudentDAOInterface {
    
    //private static final Map<String, Student> accounts = new TreeMap<>();
    //private Collection<Student> accounts = new HashSet<Student>();
    //private Map<String, Student> usernameMap = new HashMap<>();
    //private static  final Map<String, Student> usernameMap = new TreeMap<>();
    
    // customers stored by username
    private static List<Student> students = new ArrayList<>();
    

    @Override
    public int saveStudent(Student student){
        //accounts.add(student);
        //usernameMap.put(student.getStudentID(), student);
        System.out.println("Saving student: " + student);
        students.add(student);
        return 1;
    }
    
    public List<Student> getAll() {
            return students;
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
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getStudentID() == id){
                return students.get(i);
            }
        }
        return null;
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByEmail(String email){
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getEmail() == null ? email == null : students.get(i).getEmail().equals(email)){
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public Student getByUername(String username) {
     for(int i = 0; i<students.size(); i++){
            if (students.get(i).getUserName().equals(username)){
                return students.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getStudentID().equals(id)){
                students.remove(i);
            }
        }
    }

    @Override
    public boolean exists(String id) {
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getStudentID().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int updateItem(String id, Student updated_account) {
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getStudentID().equals(id)){
                students.set(i, updated_account);
            }
        }
        return 1;
    }

    @Override
    public Boolean validateCredentials(String username, String password) {
        for(int i = 0; i<students.size(); i++){
            if (students.get(i).getUserName().equals(username)){
                if (students.get(i).getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}




















































