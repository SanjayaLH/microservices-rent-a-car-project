package com.sanjaya.rentacar.demo_rentacar.repository;

import com.sanjaya.rentacar.demo_rentacar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    //Student save (Student student);

}
