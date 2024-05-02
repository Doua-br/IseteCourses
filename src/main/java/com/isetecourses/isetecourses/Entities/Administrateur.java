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
public class Administrateur implements Serializable {

    @Id
    private Long idAdmin;
    private String nomDep;
    @Column(name = "first_name")
    private  String prenom;
    @Column(name = "last_name")
    private  String nom;

    private String mail;
    private String password;
    //gerer
    @OneToMany(cascade =  CascadeType.ALL, mappedBy  = "etudiants")
    private Set<Document> documents;
    //envoyer1
    @OneToMany(cascade =  CascadeType.ALL, mappedBy  = "etudiant")
    private Set<Notification> notification;
    //consulter1
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Document> document;
}
