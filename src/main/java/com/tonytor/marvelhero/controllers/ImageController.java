package com.tonytor.marvelhero.controllers;

import com.tonytor.marvelhero.model.Image;
import com.tonytor.marvelhero.model.to.ImageTo;
import com.tonytor.marvelhero.services.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/v1/public/image", produces = MediaType.APPLICATION_JSON_VALUE)
public class ImageController {

    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ImageTo> getAll(){
        return service.getAll().stream().map(ImageTo::new).collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] get(@PathVariable("id") Integer id){
        return Base64.getDecoder().decode(service.get(id).getBase64());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Image createImage(@RequestBody byte[] bytes){
        Image image = new Image();
        image.setName(UUID.randomUUID().toString());
        image.setBase64(Base64.getEncoder().encodeToString(bytes));
        service.create(image);

        return image;
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Image updateImage(@PathVariable("id") Integer id, @RequestBody Image image) {
        return service.update(id, image);
    }
}
