package com.voixdespoir.backend.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "adoption")
public class Adoption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "parent_id")
    private Parent parent;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "child_id")
    private Child child;
    @Column
    @Temporal(TemporalType.DATE)
    private Date adoptionDate;
    @Column
    private String adoptionInstitution;
    @Column
    private String adoptionCountry;
    @Column
    private String hostedCountry;
    @Column
    private String adoptedLastName;
    @Column
    private String adoptedFirstName;
    @Column
    private String adoptionFamilyLastName;
    @Column
    private String adoptionFamilyFirstName;
    @Column
    @Temporal(TemporalType.DATE)
    private Date recentContactDate;

    public Adoption() {
    }

    public Adoption(Parent parent, Child child, Date adoptionDate, String adoptionInstitution, String adoptionCountry, String hostedCountry, String adoptedLastName, String adoptedFirstName, String adoptionFamilyLastName, String adoptionFamilyFirstName, Date recentContactDate) {
        this.parent = parent;
        this.child = child;
        this.adoptionDate = adoptionDate;
        this.adoptionInstitution = adoptionInstitution;
        this.adoptionCountry = adoptionCountry;
        this.hostedCountry = hostedCountry;
        this.adoptedLastName = adoptedLastName;
        this.adoptedFirstName = adoptedFirstName;
        this.adoptionFamilyLastName = adoptionFamilyLastName;
        this.adoptionFamilyFirstName = adoptionFamilyFirstName;
        this.recentContactDate = recentContactDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getAdoptionInstitution() {
        return adoptionInstitution;
    }

    public void setAdoptionInstitution(String adoptionInstitution) {
        this.adoptionInstitution = adoptionInstitution;
    }

    public String getAdoptionCountry() {
        return adoptionCountry;
    }

    public void setAdoptionCountry(String adoptionCountry) {
        this.adoptionCountry = adoptionCountry;
    }

    public String getHostedCountry() {
        return hostedCountry;
    }

    public void setHostedCountry(String hostedCountry) {
        this.hostedCountry = hostedCountry;
    }

    public String getAdoptedLastName() {
        return adoptedLastName;
    }

    public void setAdoptedLastName(String adoptedLastName) {
        this.adoptedLastName = adoptedLastName;
    }

    public String getAdoptedFirstName() {
        return adoptedFirstName;
    }

    public void setAdoptedFirstName(String adoptedFirstName) {
        this.adoptedFirstName = adoptedFirstName;
    }

    public String getAdoptionFamilyLastName() {
        return adoptionFamilyLastName;
    }

    public void setAdoptionFamilyLastName(String adoptionFamilyLastName) {
        this.adoptionFamilyLastName = adoptionFamilyLastName;
    }

    public String getAdoptionFamilyFirstName() {
        return adoptionFamilyFirstName;
    }

    public void setAdoptionFamilyFirstName(String adoptionFamilyFirstName) {
        this.adoptionFamilyFirstName = adoptionFamilyFirstName;
    }

    public Date getRecentContactDate() {
        return recentContactDate;
    }

    public void setRecentContactDate(Date recentContactDate) {
        this.recentContactDate = recentContactDate;
    }
}
