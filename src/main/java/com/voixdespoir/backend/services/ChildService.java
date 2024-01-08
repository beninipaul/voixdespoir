package com.voixdespoir.backend.services;

import com.voixdespoir.backend.entities.Child;
import com.voixdespoir.backend.repositories.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildService {
    private ChildRepository childRepository;
    @Autowired
    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    public List<Child> getAllChildren(){
        return childRepository.findAll();
    }

    public Optional<Child> getSpecificChild(Long id){
        return Optional.of(childRepository.findById(id).get());
    }

    public Child createChild(Child child){
        return childRepository.save(child);
    }
}
