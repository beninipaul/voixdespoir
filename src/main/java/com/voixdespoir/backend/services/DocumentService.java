package com.voixdespoir.backend.services;

import com.voixdespoir.backend.entities.Document;
import com.voixdespoir.backend.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {
    private DocumentRepository documentRepository;
    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getAllDocuments(){
        return documentRepository.findAll();
    }

    public Optional<Document> getSpecificDocument(Long id){
        return documentRepository.findById(id);
    }

    public Document createDocument(Document document){
        return documentRepository.save(document);
    }
}
