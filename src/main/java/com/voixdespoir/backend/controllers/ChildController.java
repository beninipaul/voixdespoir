package com.voixdespoir.backend.controllers;

import com.voixdespoir.backend.entities.Child;
import com.voixdespoir.backend.services.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ChildController {
    private ChildService childService;
    @Autowired
    public ChildController(ChildService childService) {
        this.childService = childService;
    }
    @GetMapping("/children")
    public List<Child> getAll(){
        return childService.getAllChildren();
    }

    @GetMapping("/children/{id}")
    public Optional<Child> getSpecificChild(@PathVariable String id){
        return childService.getSpecificChild(Long.parseLong(id));
    }

    @PostMapping("/children")
    public Child createChild(@RequestBody Child child){
        return childService.createChild(child);
    }
}
