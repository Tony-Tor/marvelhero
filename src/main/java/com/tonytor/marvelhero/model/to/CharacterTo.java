package com.tonytor.marvelhero.model.to;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class CharacterTo {
    @Size(max = 50)
    @NotNull
    private String name;
    @NotNull
    private LocalDate created;
    @Size(max = 2000)
    private String description;
    private Integer image;
}
