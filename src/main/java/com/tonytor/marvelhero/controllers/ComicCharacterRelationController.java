package com.tonytor.marvelhero.controllers;


import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.model.to.ComicCharacterTo;
import com.tonytor.marvelhero.services.CharacterService;
import com.tonytor.marvelhero.services.ComicCharacterService;
import com.tonytor.marvelhero.services.ComicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/public", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComicCharacterRelationController {
    static private final Logger logger = LoggerFactory.getLogger(CharacterController.class);

    private final CharacterService characterService;
    private final ComicService comicService;
    private final ComicCharacterService comicCharacterService;

    public ComicCharacterRelationController(CharacterService characterService, ComicService comicService, ComicCharacterService comicCharacterService) {
        this.characterService = characterService;
        this.comicService = comicService;
        this.comicCharacterService = comicCharacterService;
    }

    @PostMapping("/characters/{character_id}/add_comic/{comic_id}")
    public ComicCharacterTo createRelationWithCharacter(@PathVariable("character_id") Integer characterId, @PathVariable("comic_id") Integer comicId){
        return createRelation(characterId, comicId);
    }

    @PostMapping("/comics/{comic_id}/add_character/{character_id}")
    public ComicCharacterTo createRelationWithComic(@PathVariable("character_id") Integer characterId, @PathVariable("comic_id") Integer comicId){
        return createRelation(characterId, comicId);
    }

    public ComicCharacterTo createRelation(Integer characterId, Integer comicId){
        Character character = characterService.get(characterId);
        Comic comic = comicService.get(comicId);
        return new ComicCharacterTo(comicCharacterService.createComicCharacterRelation(character, comic));
    }
}
