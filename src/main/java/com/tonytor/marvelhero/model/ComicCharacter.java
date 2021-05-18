package com.tonytor.marvelhero.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Data
public class ComicCharacter{

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comic_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Comic comic;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "character_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Character character;


}
