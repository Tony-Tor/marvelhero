package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.config.exceptions.NotFoundException;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.repository.ComicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService implements IService<Comic> {
    static private final Logger logger = LoggerFactory.getLogger(ComicService.class);
    private final ComicRepository repository;

    public ComicService(ComicRepository repository) {
        this.repository = repository;
    }


    @Override
    public Comic get(int id) {
        logger.info(String.format("Get comic with id: %s", id));
        return repository.findById(id).orElseThrow(
                ()->new NotFoundException(
                        String.format("Comic not found by id: %d", id)
                )
        );
    }

    @Override
    public List<Comic> getAll() {
        logger.info(String.format("Get all comic"));
        return (List<Comic>) repository.findAll();
    }

    @Override
    public Comic create(Comic obj) {
        logger.info(String.format("Create new comic: %s", obj));
        obj.setId(null);
        return repository.save(obj);
    }

    @Override
    public Comic update(int id, Comic obj) {
        logger.info(String.format("Update comic with id=%s to %s", id, obj));
        obj.setId(id);
        return repository.save(obj);
    }

    @Override
    public void delete(int id) {
        logger.info(String.format("Delete comic with id: %s", id));
        repository.deleteById(id);
    }

    public List<Character> getCharacters(int id){
        logger.info(String.format("Get all characters of comic", id));
        return null;
    }
}
