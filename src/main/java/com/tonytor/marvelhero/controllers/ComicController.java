package com.tonytor.marvelhero.controllers;

import com.tonytor.marvelhero.model.to.ComicTo;
import com.tonytor.marvelhero.utils.filters.CharacterFilterAndSorter;
import com.tonytor.marvelhero.utils.filters.ComicFilterAndSorter;
import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.services.ComicCharacterService;
import com.tonytor.marvelhero.services.ComicService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/public/comics", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComicController {

    private final ComicService service;
    private final ComicCharacterService comicCharacterService;

    public ComicController(ComicService service, ComicCharacterService comicCharacterService) {
        this.service = service;
        this.comicCharacterService = comicCharacterService;
    }

    @GetMapping()
    public List<Comic> getAll(@RequestParam(required = false) Map<String,String> allParams){
        return ComicFilterAndSorter
                .filterAndSort(
                        allParams,
                        service.getAll()
                );
    }

    @GetMapping("/{id}")
    public Comic get(@PathVariable("id") Integer id){
        return service.get(id);
    }

    @GetMapping("/{id}/characters")
    public List<Character> getCharacters(@PathVariable("id") Integer id, @RequestParam(required = false) Map<String,String> allParams){
        return CharacterFilterAndSorter
                .filterAndSort(
                        allParams,
                        comicCharacterService.getCharacterByComic(id)
                );
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comic createComic(@RequestBody Comic comic){
        return service.create(comic);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comic updateComic(@PathVariable("id") Integer id, @RequestBody ComicTo comic){
        return service.update(id, comic);
    }
}
