package com.voixdespoir.backend.controllers;

import com.voixdespoir.backend.entities.Adoption;
import com.voixdespoir.backend.services.AdoptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AdoptionController {
    private AdoptionService adoptionService;
    @Autowired
    public AdoptionController(AdoptionService adoptionService) {
        this.adoptionService = adoptionService;
    }

    @GetMapping("/adoptions")
    public List<Adoption> getAllAdoptions(){
        return adoptionService.getAllAdoption();
    }
    @GetMapping("/adoptions/{id}")
    public Optional<Adoption> getSpecificAdoption(@PathVariable String id){
        return adoptionService.getSpecificAdoption(Long.parseLong(id));
    }
    @PostMapping("/adoptions")
    public Adoption createAdoption(@RequestBody Adoption adoption){
        return adoptionService.createAdoption(adoption);
    }
}
