package com.tonytor.marvelhero.services;

import com.tonytor.marvelhero.model.Image;
import com.tonytor.marvelhero.repository.ImageRepository;
import com.tonytor.marvelhero.utils.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService implements IService<Image>{
    static private final Logger logger = LoggerFactory.getLogger(ComicService.class);
    private final ImageRepository repository;

    public ImageService(ImageRepository repository) {
        this.repository = repository;
    }

    public Image get(int id) {
        logger.info(String.format("Get image with id: %s", id));
        return repository.findById(id).orElseThrow(
                ()->new NotFoundException(
                        String.format("Image not found by id: %d", id)
                )
        );
    }

    public List<Image> getAll() {
        logger.info("Get all images");
        return (List<Image>) repository.findAll();
    }

    public Image create(Image obj) {
        logger.info(String.format("Create new image: %s", obj));
        obj.setId(null);
        return repository.save(obj);
    }

    public Image update(int id, Image obj) {
        logger.info(String.format("Update image with id=%s to %s", id, obj));
        obj.setId(id);
        return repository.save(obj);
    }

}
