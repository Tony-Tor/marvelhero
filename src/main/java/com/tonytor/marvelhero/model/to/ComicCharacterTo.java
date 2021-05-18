package com.tonytor.marvelhero.model.to;

import com.tonytor.marvelhero.model.ComicCharacter;
import lombok.Data;

@Data
public class ComicCharacterTo {

    public ComicCharacterTo(ComicCharacter comicCharacter) {
        this.nameCharacter = comicCharacter.getCharacter().getName();
        this.nameComic = comicCharacter.getComic().getName();
    }

    String nameCharacter;
    String nameComic;
}
