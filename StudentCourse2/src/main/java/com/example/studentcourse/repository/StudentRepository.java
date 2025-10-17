package com.example.studentcourse.repository;

import com.example.studentcourse.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findByCourse_CourseName(String courseName);
    List<StudentEntity> findByCourseIsNull();
    List<StudentEntity> findByCityAndCourse_Instructor(String city, String instructor);
}
