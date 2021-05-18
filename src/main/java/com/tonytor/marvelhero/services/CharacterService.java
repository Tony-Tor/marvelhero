package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.config.exceptions.NotFoundException;
import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.repository.CharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService  implements IService<Character> {
    static private final Logger logger = LoggerFactory.getLogger(CharacterService.class);
    private final CharacterRepository repository;

    public CharacterService(CharacterRepository repository) {
        this.repository = repository;
    }


    @Override
    public Character get(int id) {
        logger.info(String.format("Get character with id: %s", id));
        return repository.findById(id).orElseThrow(
                ()->new NotFoundException(
                        String.format("Character not found by id: %d", id)
                )
        );
    }

    @Override
    public List<Character> getAll() {
        logger.info(String.format("Get all character"));
        return (List<Character>) repository.findAll();
    }

    @Override
    public Character create(Character obj) {
        logger.info(String.format("Create new character: %s", obj));
        obj.setId(null);
        return repository.save(obj);
    }

    @Override
    public Character update(int id, Character obj) {
        logger.info(String.format("Update character with id=%s to %s", id, obj));
        obj.setId(id);
        return repository.save(obj);
    }

    @Override
    public void delete(int id) {
        logger.info(String.format("Delete character with id: %s", id));
        repository.deleteById(id);
    }
}
