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
public class Character extends AbstractIdEntity{
    String name;
    @ManyToMany
    @JoinTable(name="character_сomic",
            joinColumns=@JoinColumn(name="character_id"),
            inverseJoinColumns=@JoinColumn(name="сomic_id"))
    Set<Comic> сomicSet;
    LocalDate created;
    String description;
    String status;

}