package com.sanjaya.rentacar.demo_rentacar.service;

import com.sanjaya.rentacar.demo_rentacar.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}
