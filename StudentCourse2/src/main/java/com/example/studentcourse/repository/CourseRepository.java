package com.example.studentcourse.repository;

import com.example.studentcourse.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    List<CourseEntity> findByStudentsIsEmpty();
}
