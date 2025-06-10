package com.project.app.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Salaries", schema = "dbo")
public class Salaries {

    @Id
    @Column(name = "MatriculeSlarie", nullable = false)
    private Integer matriculeSlarie;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Prenom", nullable = false)
    private String prenom;

    @Column(name = "DateEntree")
    private LocalDate dateEntree;

    @Column(name = "DateNaissance")
    private LocalDate dateNaissance;

    // Getters et setters

    public Integer getMatriculeSlarie() {
        return matriculeSlarie;
    }

    public void setMatriculeSlarie(Integer matriculeSlarie) {
        this.matriculeSlarie = matriculeSlarie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        this.dateEntree = dateEntree;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}

