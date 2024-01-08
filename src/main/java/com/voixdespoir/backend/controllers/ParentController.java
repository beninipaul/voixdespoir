package com.voixdespoir.backend.controllers;

import com.voixdespoir.backend.entities.Parent;
import com.voixdespoir.backend.services.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ParentController {
    private ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping("/parents")
    public List<Parent> getAll(){
        return parentService.getAllParents();
    }

    @GetMapping("/parents/{id}")
    public Optional<Parent> getSpecificParent(@PathVariable("id") String id){
        return parentService.getSpecificParent(Long.parseLong(id));
    }

    @PostMapping("/parents")
    public Parent createParent(@RequestBody Parent parent){
        return parentService.createParent(parent);
    }
}
