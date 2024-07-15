package com.sanjaya.rentacar.demo_rentacar.controller;

import com.sanjaya.rentacar.demo_rentacar.model.Student;
import com.sanjaya.rentacar.demo_rentacar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Spring Boot";// no need any servlet container Tomcat is embed within Spring
    }
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetingPost(){
        return "Hello Spring Boot in POST";// no need any servlet container Tomcat is embed within Spring
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
        Student student = studentService.fetchStudentById(id);
        if (student==null) {
            return ResponseEntity.notFound().build();
        }else {
           return ResponseEntity.ok().body(student);
        }

    }
}
