/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domain.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Derek Zou
 */

public class StudentDAO implements StudentDAOInterface {
    
   private static final Map< String,Student> students = new TreeMap<>();
//    private Collection<Student> accounts = new HashSet<Student>();
//    private Map<String, Student> usernameMap = new HashMap<>();
//    private static  final Map<String, Student> usernameMap = new TreeMap<>();
    
    // customers stored by username
    //private static List<Student> students = new ArrayList<>();
    

   
    
    public Collection<Student> getAll() {
            return students.values();
    }

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

//    @Override
//    public Student getByUsername(String username) {
//     for(int i = 0; i<students.size(); i++){
//            if (students.get(i).getUserName().equals(username)){
//                return students.get(i);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public int delete(String id) {
//        for(int i = 0; i<students.size(); i++){
//            if (students.get(i).getStudentID().equals(id)){
//                students.remove(i);
//            }
//        }
//        return 1;
//    }
//
//    @Override
//    public boolean exists(String id) {
//        for(int i = 0; i<students.size(); i++){
//            if (students.get(i).getStudentID().equals(id)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int updateItem(String id, Student updated_account) {
////        for(int i = 0; i<students.size(); i++){
////            if (students.get(i).getStudentID().equals(id)){
////                students.put(i, updated_account);
////            }
////        }
//       return 1;
//    }
//
//    @Override
//    public Boolean validateCredentials(String username, String password) {
//        for(int i = 0; i<students.size(); i++){
//            if (students.get(i).getUserName().equals(username)){
//                if (students.get(i).getPassword().equals(password)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int saveStudent(Student student, String email) {
//        //TODO validate
//        
//        students.put( email,student );
//       return 1;
//    }

    @Override
    public void saveStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getStudent(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getRankedListStudents(String DepartmentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getListStudents(String DepartmentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateItem(String id, Student updated_account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}






















































