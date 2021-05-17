package com.tonytor.marvelhero.repository;

import com.tonytor.marvelhero.model.Comic;
import org.springframework.data.repository.CrudRepository;

public interface ComicRepository extends CrudRepository<Comic, Integer> {

}
