package com.tonytor.marvelhero.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
@Access(AccessType.FIELD)
@Data
public abstract class AbstractIdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
