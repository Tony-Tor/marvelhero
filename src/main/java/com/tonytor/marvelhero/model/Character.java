package com.tonytor.marvelhero.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Character extends AbstractIdEntity{
    @Size(max = 50)
    @Column(nullable = false)
    @NotNull
    String name;
    @Column(nullable = false)
    @NotNull
    LocalDate created;
    @Size(max = 2000)
    String description;

}