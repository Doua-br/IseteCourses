package com.isetecourses.isetecourses.Repository;

import com.isetecourses.isetecourses.Entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Administrateur,Long> {
}