package com.tonytor.marvelhero.repository;

import com.tonytor.marvelhero.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Integer> {
}
