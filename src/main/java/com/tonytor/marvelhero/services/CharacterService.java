package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.model.Character;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService  implements IService<Character> {
    static private final Logger logger = LoggerFactory.getLogger(CharacterService.class);

    @Override
    public Character get(int id) {
        return null;
    }

    @Override
    public List<Character> getAll() {
        return null;
    }

    @Override
    public Character create(Character obj) {
        return null;
    }

    @Override
    public Character update(int id, Character obj) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
