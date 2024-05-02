package com.isetecourses.isetecourses.Repository;

import com.isetecourses.isetecourses.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    public  List<Etudiant> findByDepartementIdDepart(Long id);
    public Etudiant(Long id);
    public Etudiant findByNomE(String nom);
    public Etudiant findByPrenomE(String prenom);
}
