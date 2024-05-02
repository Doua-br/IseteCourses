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
public class Etudiant {


        private static final long serialVersionUID = 1L;
        @Id
        private Long idUser;
        @Column(name = "first_name")
        private String prenom;
        @Column(name = "last_name")
        private String nom;

        private String mail;
        private String password;



    //consulter2
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Document> document;

    //envoyer2
    @OneToMany(cascade =  CascadeType.ALL, mappedBy  = "etudiant")
    private Set<Notification> notification;


    //deriger
    @ManyToOne
    private Department department;




}