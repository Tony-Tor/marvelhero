package com.tonytor.marvelhero.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Comic extends AbstractIdEntity{
    String name;
    @ManyToMany
    @JoinTable(name="character_сomic",
            joinColumns=@JoinColumn(name="сomic_id"),
            inverseJoinColumns=@JoinColumn(name="character_id"))
    Set<Character> characterSet;
    LocalDate created;
    String description;
    Integer prise;
    Integer pageOfCount;
    String status;
}
