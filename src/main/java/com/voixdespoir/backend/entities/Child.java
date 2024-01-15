package com.voixdespoir.backend.entities;

import com.voixdespoir.backend.enums.Gender;
import jakarta.persistence.*;

@Entity
@Table(name = "child")
public class Child extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "child")
    private SearchRequest searchRequest;

    @OneToOne(mappedBy = "child")
    private Adoption adoption;

    public Child() {
        super();
    }

    public Child(String firstName, String middleName, String lastName, Gender gender, Long id,
                 SearchRequest searchRequest, Adoption adoption) {
        super(firstName, middleName, lastName, gender);
        this.id = id;
        this.searchRequest = searchRequest;
        this.adoption = adoption;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adoption getAdoption() {
        return adoption;
    }

    public void setAdoption(Adoption adoption) {
        this.adoption = adoption;
    }
}
