package com.voixdespoir.backend.entities;

import com.voixdespoir.backend.enums.Gender;
import com.voixdespoir.backend.enums.ParentType;
import jakarta.persistence.*;

@Entity
@Table(name = "parent")
public class Parent extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private ParentType parentType;
    @OneToOne(mappedBy = "parent")
    private SearchRequest searchRequest;

    public Parent() {
        super();
    }


    public Parent(String firstName, String middleName, String lastName, Gender gender, ParentType parentType) {
        super(firstName, middleName, lastName, gender);
        this.parentType = parentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParentType getParentType() {
        return parentType;
    }

    public void setParentType(ParentType parentType) {
        this.parentType = parentType;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", parentType=" + parentType +
                '}';
    }
}
