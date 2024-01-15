package com.voixdespoir.backend.entities;

import com.voixdespoir.backend.enums.Relationship;
import com.voixdespoir.backend.enums.RequestType;
import com.voixdespoir.backend.enums.Status;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "search_request")
public class SearchRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private RequestType requestType;
    @Column
    private Relationship relationship;
    @Column
    private Status status;
    @Column
    private String notes;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Parent parent;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "child_id", referencedColumnName = "id")
    private Child child;
    @OneToMany(mappedBy = "searchRequest")
    private List<Document> document;

    public SearchRequest() {
    }

    public SearchRequest(RequestType requestType, Relationship relationship, Status status,
                         String notes, Parent parent, Child child, List<Document> document) {
        this.requestType = requestType;
        this.relationship = relationship;
        this.status = status;
        this.notes = notes;
        this.parent = parent;
        this.child = child;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Document> getDocument() {
        return document;
    }

    public void setDocument(List<Document> document) {
        this.document = document;
    }
}
