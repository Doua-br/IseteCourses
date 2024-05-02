package com.isetecourses.isetecourses.Repository;


import com.isetecourses.isetecourses.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findAllByIdDepart(Long id);
}
