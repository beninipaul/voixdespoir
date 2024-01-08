package com.voixdespoir.backend.services;

import com.voixdespoir.backend.entities.Parent;
import com.voixdespoir.backend.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentService {
    private ParentRepository parentRepository;
    @Autowired
    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

   public List<Parent> getAllParents(){
        return parentRepository.findAll();
   }

   public Optional<Parent> getSpecificParent(Long id){
        return Optional.of(parentRepository.findById(id).get());
   }

   public Parent createParent(Parent parent){
       return parentRepository.save(parent);
   }

   public void editParent(Parent parent){
        parentRepository.save(parent);
   }
}
