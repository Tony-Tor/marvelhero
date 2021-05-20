package com.tonytor.marvelhero.model;

import lombok.Data;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
@Data
public abstract class AbstractIdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
