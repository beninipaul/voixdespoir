package com.voixdespoir.backend.controllers;

import com.voixdespoir.backend.entities.Document;
import com.voixdespoir.backend.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class DocumentController {
    private DocumentService documentService;
    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }
    @GetMapping("/documents")
    public List<Document> getAllDocuments(){
        return documentService.getAllDocuments();
    }

    @GetMapping("/documents/{id}")
    public Optional<Document> getSpecific(@PathVariable String id){
        return documentService.getSpecificDocument(Long.parseLong(id));
    }

    @PostMapping("/documents")
    public Document createDocument(@RequestBody  Document document){
        return documentService.createDocument(document);
    }
}
