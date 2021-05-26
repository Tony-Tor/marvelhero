package com.tonytor.marvelhero.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Character extends AbstractIdEntity{
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    @NotNull
    private String name;
    @Column(nullable = false)
    @NotNull
    private LocalDate created;
    @Size(max = 2000)
    @Column(nullable = false, length = 2000)
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private Image image;


}