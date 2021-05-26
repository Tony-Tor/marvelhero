package com.tonytor.marvelhero.model.to;

import com.tonytor.marvelhero.model.ComicCharacter;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class ComicCharacterTo {
    static private final Logger logger = LoggerFactory.getLogger(ComicCharacterTo.class);

    public ComicCharacterTo(ComicCharacter comicCharacter) {
        this.nameCharacter = comicCharacter.getCharacter().getName();
        this.nameComic = comicCharacter.getComic().getName();
    }

    String nameCharacter;
    String nameComic;
}
