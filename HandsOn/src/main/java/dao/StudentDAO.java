/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import domain.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Derek Zou
 */
public final class StudentDAO implements StudentDAOInterface {
    
    //private static final Map<String, Student> accounts = new TreeMap<>();
    //private Collection<Student> accounts = new HashSet<Student>();
    //private Map<String, Student> usernameMap = new HashMap<>();
    //private static  final Map<String, Student> usernameMap = new TreeMap<>();
    
    // students stored by username
    private static final Map<String, Student> students = new HashMap<>();
    
    	public StudentDAO() {
		if (students.isEmpty()) {
			// some dummy data for testing
                        Student boris = new Student();
                        boris.setUserName("boris");
                        boris.setFirstName("Boris");
                        boris.setLastName("McNorris");
                        boris.setEmail("boris@example.net");
                        boris.setCellNumber("022123123");
                        boris.setStudentID("4300K");
                        boris.setHighSchool("Hillmorton");
                        boris.setGender("male");			

                        Student doris = new Student();
                        doris.setUserName("Doris233");
                        doris.setFirstName("Doris");
                        doris.setLastName("McNulty");
                        doris.setEmail("boris@example.net");
                        doris.setCellNumber("022843123");
                        doris.setStudentID("4114K");
                        doris.setHighSchool("Morton");
                        doris.setGender("female");	

                        this.saveStudent(boris);
                        this.saveStudent(doris);
		}
	}


        @Override
        public void saveStudent(Student student){
            //accounts.add(student);
            //usernameMap.put(student.getStudentID(), student);
            System.out.println("Saving student: " + student);
            students.put(student.getUserName(), student);
        }
        
        @Override
        public void removeStudent(Student student){
            students.remove(student);
        }

        @Override
        public Student getByStudentID(String id) {
            return students.get(id);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Student getByEmail(String email){
            return students.get(email);
        }

        @Override
        public Student getByUsername(String username) {
            return students.get(username);
        }

        @Override
        public void updateStudent(String id, Student updated_account) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Boolean validateCredentials(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}








































































