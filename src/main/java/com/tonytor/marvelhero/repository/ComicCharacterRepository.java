package com.tonytor.marvelhero.repository;

import com.tonytor.marvelhero.model.Character;
import com.tonytor.marvelhero.model.Comic;
import com.tonytor.marvelhero.model.ComicCharacter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComicCharacterRepository extends CrudRepository<ComicCharacter, Integer> {
    List<ComicCharacter> findAllByCharacter_Id(Integer id);
    List<ComicCharacter> findAllByComic_Id(Integer id);
}
