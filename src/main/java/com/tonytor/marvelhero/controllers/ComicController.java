package com.tonytor.marvelhero.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/public/comics", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComicController {
    static private final Logger logger = LoggerFactory.getLogger(ComicController.class);
}
