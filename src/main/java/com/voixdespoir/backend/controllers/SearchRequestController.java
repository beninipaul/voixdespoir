package com.voixdespoir.backend.controllers;

import com.voixdespoir.backend.entities.SearchRequest;
import com.voixdespoir.backend.services.SearchRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SearchRequestController {
    private SearchRequestService searchRequestService;
    @Autowired
    public SearchRequestController(SearchRequestService searchRequestService) {
        this.searchRequestService = searchRequestService;
    }
    @GetMapping("/searchRequests")
    public List<SearchRequest> getAllRequest(){
        return searchRequestService.getAllSearchRequests();
    }

    @GetMapping("/searchRequests/{id}")
    public Optional<SearchRequest> getSpecificRequest(@PathVariable String id){
        return searchRequestService.getSpecificSearchRequest(Long.parseLong(id));
    }
    @PostMapping("/searchRequests")
    public SearchRequest createSearch(@RequestBody SearchRequest searchRequest){
        return searchRequestService.createSearchRequest(searchRequest);
    }
    
}
