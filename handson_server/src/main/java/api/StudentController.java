/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.StudentService;

/**
 *
 * @author Dominic
 */
@RequestMapping("api/v1/student")
@RestController
public class StudentController {
    private final StudentService studentService;
    
    @Autowired
    public StudentController(StudentService studentservice) {
        this.studentService = studentservice;
    }
    
    @GetMapping(path = "{id}")
    public Student getStudentByID(@PathVariable("id") String id){
        return studentService.getStudentByID(id);
    }
    
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    
    @PutMapping(path = {"id"})
    public void updateStudent(@PathVariable("id") String id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }
    
    @DeleteMapping(path={"id"})
    public void deleteStudent(@PathVariable("id") String id){
        studentService.deleteStudent(id);
    }
}
