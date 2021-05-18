package com.tonytor.marvelhero.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@IdClass(ComicCharacter.class)
public class ComicCharacter implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Comic comic;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    Character character;


}
