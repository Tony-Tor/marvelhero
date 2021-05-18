package com.tonytor.marvelhero.controllers;

import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.services.ComicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/public/comics", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComicController {
    static private final Logger logger = LoggerFactory.getLogger(ComicController.class);

    private final ComicService service;

    public ComicController(ComicService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Comic> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Comic get(@PathVariable("id") Integer id){
        return service.get(id);
    }

    @GetMapping("/{id}/characters")
    public List<Character> getCharacters(@PathVariable("id") Integer id){
        return service.getCharacters();
    }

    @PostMapping()
    public Comic createComic(){
        service.
    }



}
