package com.isetecourses.isetecourses.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
public class Document implements Serializable {
    @Id
    private Long idDoc;
    @Column(name = "title")
    private  String titre;
    @Column(name = "contenu")
    private File contenu;
    @Enumerated(EnumType.STRING)
    private EtatDoc etat;

    //specifier
    @ManyToMany(mappedBy = "documents", cascade = CascadeType.ALL)
    private Set<Department> departments;

    //consulter1
    @ManyToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private Set<Administrateur>administrateurs;

    //consulter2
    @ManyToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private Set<Etudiant>etudiants;

    //gerer
    @ManyToOne
    private Etudiant etudiant;


}
