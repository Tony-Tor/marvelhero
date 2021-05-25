package com.tonytor.marvelhero.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Comic extends AbstractIdEntity{
    @Size(max = 50)
    @Column(nullable = false, length = 2000)
    @NotNull
    String name;
    @Column(nullable = false)
    @NotNull
    LocalDate published;
    @Size(max = 2000)
    @Column(nullable = false, length = 2000)
    String description;
    @Range(min = 0, max = 3000000)
    @Column(nullable = false)
    Integer prise;
    @Range(min = 1, max = 5000)
    @Column(nullable = false)
    Integer pageOfCount;
    @ManyToOne(fetch = FetchType.EAGER)
    Image image;
}
