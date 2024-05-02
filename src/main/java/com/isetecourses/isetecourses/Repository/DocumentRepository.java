package com.isetecourses.isetecourses.Repository;


import com.isetecourses.isetecourses.Entities.Department;
import com.isetecourses.isetecourses.Entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    public Department findAllByIdId(Long id);
}
