package com.voixdespoir.backend.entities;

import com.voixdespoir.backend.enums.DocumentType;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private String note;
    @Column
    private String url;
    @Column
    private DocumentType documentType;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private SearchRequest searchRequest;

    public Document() {
    }

    public Document(String description, String note, String url, DocumentType documentType, SearchRequest searchRequest) {
        this.description = description;
        this.note = note;
        this.url = url;
        this.documentType = documentType;
        this.searchRequest = searchRequest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public SearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }
}
