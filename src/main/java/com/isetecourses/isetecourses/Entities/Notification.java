package com.isetecourses.isetecourses.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
public class Notification implements Serializable {
   @Id
   private Long idNotif;
    @Column(name = "object")
    private  String objet;

    private Date dateNotif;

    //envoyer
    @ManyToOne
    private Etudiant e;
    @ManyToOne
    private Administrateur administrateur;

}
