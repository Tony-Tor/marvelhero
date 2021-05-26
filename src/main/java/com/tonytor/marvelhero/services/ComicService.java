package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.model.to.ComicTo;
import com.tonytor.marvelhero.utils.exceptions.NotFoundException;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.repository.ComicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComicService implements IService<Comic> {
    static private final Logger logger = LoggerFactory.getLogger(ComicService.class);
    private final ComicRepository repository;
    private final ImageService imageService;

    public ComicService(ComicRepository repository, ImageService imageService) {
        this.repository = repository;
        this.imageService = imageService;
    }

    public Comic get(int id) {
        logger.info(String.format("Get comic with id: %s", id));
        return repository.findById(id).orElseThrow(
                ()->new NotFoundException(
                        String.format("Comic not found by id: %d", id)
                )
        );
    }

    public List<Comic> getAll() {
        logger.info("Get all comic");
        return (List<Comic>) repository.findAll();
    }

    public Comic create(Comic obj) {
        logger.info(String.format("Create new comic: %s", obj));
        obj.setId(null);
        return repository.save(obj);
    }

    @Transactional
    public Comic update(int id, ComicTo obj) {
        logger.info(String.format("Update comic with id=%s to %s", id, obj));

        Comic comic = new Comic();
        comic.setName(obj.getName());
        comic.setDescription(obj.getDescription());
        comic.setPublished(obj.getPublished());
        comic.setPageOfCount(obj.getPageOfCount());
        comic.setPrise(obj.getPrise());
        comic.setImage(imageService.get(obj.getImage()));
        comic.setId(id);
        return repository.save(comic);
    }

}
