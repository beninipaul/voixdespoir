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

    public Child() {
        super();
    }

    public Child(String firstName, String middleName, String lastName, Gender gender) {
        super(firstName, middleName, lastName, gender);
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
}
