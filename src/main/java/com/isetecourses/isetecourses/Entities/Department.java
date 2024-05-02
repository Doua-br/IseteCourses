package com.isetecourses.isetecourses.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Department implements Serializable {
    @Id
    private Long idDep;
    private String nomDep;
    @Enumerated(EnumType.STRING)
    private NomDep dep;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Document> documents;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private Set<Etudiant> etudiants;


}
