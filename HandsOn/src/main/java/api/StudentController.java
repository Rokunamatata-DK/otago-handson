/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.StudentService;

/**
 *
 * @author Domini
 */
@RequestMapping("api/v1/person")
@RestController
public class StudentController {
    private final StudentService studentService;
    
    @Autowired
    public StudentController(StudentService studentservice) {
        this.studentService = studentservice;
    }
    
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    
}
