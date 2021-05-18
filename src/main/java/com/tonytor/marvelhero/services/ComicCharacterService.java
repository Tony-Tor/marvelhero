package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.repository.ComicCharacterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ComicCharacterService {
    static private final Logger logger = LoggerFactory.getLogger(ComicCharacterService.class);
    private final ComicCharacterRepository repository;

    public ComicCharacterService(ComicCharacterRepository repository) {
        this.repository = repository;
    }
}
