package com.tonytor.marvelhero.model.to;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class ComicTo {
    @Size(max = 50)
    @NotNull
    private String name;
    @NotNull
    private LocalDate published;
    @Size(max = 2000)
    private String description;
    @Range(min = 0, max = 3000000)
    private Integer prise;
    @Range(min = 1, max = 5000)
    private Integer pageOfCount;
    private Integer image;
}
