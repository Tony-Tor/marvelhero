package com.tonytor.marvelhero.model.to;

import com.tonytor.marvelhero.model.Image;
import lombok.Data;

@Data
public class ImageTo {
    private String id;
    private String name;

    public ImageTo(Image image) {
        this.id = image.getId().toString();
        this.name = image.getName();
    }
}
