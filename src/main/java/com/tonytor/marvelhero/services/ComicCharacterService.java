package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.model.ComicCharacter;
import com.tonytor.marvelhero.repository.ComicCharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComicCharacterService {
    static private final Logger logger = LoggerFactory.getLogger(ComicCharacterService.class);
    private final ComicCharacterRepository repository;

    public ComicCharacterService(ComicCharacterRepository repository) {
        this.repository = repository;
    }

    public List<Character> getCharacterByComic(Integer id){
        return repository.findAllByComic_Id(id)
                .stream()
                .map(ComicCharacter::getCharacter)
                .collect(Collectors.toList());
    }

    public List<Comic> getComicByCharacter(Integer id){
        return repository.findAllByCharacter_Id(id)
                .stream()
                .map(ComicCharacter::getComic)
                .collect(Collectors.toList());
    }

    public ComicCharacter createComicCharacterRelation(Character character, Comic comic){
        ComicCharacter comicCharacter = new ComicCharacter();
        comicCharacter.setCharacter(character);
        comicCharacter.setComic(comic);
        return repository.save(comicCharacter);
    }
}
