package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.model.Comic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService implements IService<Comic> {
    static private final Logger logger = LoggerFactory.getLogger(ComicService.class);

    @Override
    public Comic get(int id) {
        return null;
    }

    @Override
    public List<Comic> getAll() {
        return null;
    }

    @Override
    public Comic create(Comic obj) {
        return null;
    }

    @Override
    public Comic update(int id, Comic obj) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
