package com.tonytor.marvelhero.repository;

import com.tonytor.marvelhero.model.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository  extends CrudRepository<Image, Integer> {
}
