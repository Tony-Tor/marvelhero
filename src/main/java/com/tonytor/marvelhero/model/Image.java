package com.tonytor.marvelhero.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Image extends AbstractIdEntity {
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    @NotNull
    private String name;
    @NotNull
    @Size(max = 100000)
    @Column(length = 100000)
    private String base64;
}
