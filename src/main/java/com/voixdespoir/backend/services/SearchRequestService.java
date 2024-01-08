package com.voixdespoir.backend.services;

import com.voixdespoir.backend.entities.SearchRequest;
import com.voixdespoir.backend.repositories.SearchRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchRequestService {
    private SearchRequestRepository searchRequestRepository;

    @Autowired
    public SearchRequestService(SearchRequestRepository searchRequestRepository) {
        this.searchRequestRepository = searchRequestRepository;
    }

    public List<SearchRequest> getAllSearchRequests(){
        return searchRequestRepository.findAll();
    }

    public Optional<SearchRequest> getSpecificSearchRequest(Long id){
        return Optional.of(searchRequestRepository.findById(id).get());
    }

    public SearchRequest createSearchRequest(SearchRequest searchRequest){
        return searchRequestRepository.save(searchRequest);
    }

    public void editSearchRequest(SearchRequest searchRequest){
        searchRequestRepository.save(searchRequest);
    }
}
