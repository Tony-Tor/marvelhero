package com.tonytor.marvelhero.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"comic_id","character_id"}))
public class ComicCharacter extends AbstractIdEntity{


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Comic comic;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Character character;


}
