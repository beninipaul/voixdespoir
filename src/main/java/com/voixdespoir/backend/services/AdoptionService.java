package com.voixdespoir.backend.services;

import com.voixdespoir.backend.entities.Adoption;
import com.voixdespoir.backend.entities.Child;
import com.voixdespoir.backend.repositories.AdoptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdoptionService {
    private AdoptionRepository adoptionRepository;

    @Autowired
    public AdoptionService(AdoptionRepository adoptionRepository) {
        this.adoptionRepository = adoptionRepository;
    }

    public List<Adoption> getAllAdoption(){
        return adoptionRepository.findAll();
    }

    public Optional<Adoption> getSpecificAdoption(Long id){
        return Optional.of(adoptionRepository.findById(id).get());
    }

    public Adoption createAdoption(Adoption adoption){
        return adoptionRepository.save(adoption);
    }
}
