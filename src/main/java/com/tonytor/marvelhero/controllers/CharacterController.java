package com.tonytor.marvelhero.controllers;

import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.services.CharacterService;
import com.tonytor.marvelhero.services.ComicCharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/public/characters", produces = MediaType.APPLICATION_JSON_VALUE)
public class CharacterController {
    static private final Logger logger = LoggerFactory.getLogger(CharacterController.class);

    private final CharacterService service;
    private final ComicCharacterService comicCharacterService;

    public CharacterController(CharacterService service, ComicCharacterService comicCharacterService) {
        this.service = service;
        this.comicCharacterService = comicCharacterService;
    }

    @GetMapping()
    public List<Character> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Character get(@PathVariable("id") Integer id){
        return service.get(id);
    }

    @GetMapping("/{id}/characters")
    public List<Comic> getCharacters(@PathVariable("id") Integer id){
        return comicCharacterService.getComicByCharacter(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Character createComic(@RequestBody Character character){
        return service.create(character);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Character updateCharacter(@PathVariable("id") Integer id, @RequestBody Character character){
        return service.update(id, character);
    }
}
