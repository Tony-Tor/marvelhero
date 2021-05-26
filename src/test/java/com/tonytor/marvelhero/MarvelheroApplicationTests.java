package com.tonytor.marvelhero;

import com.tonytor.marvelhero.controllers.CharacterController;
import com.tonytor.marvelhero.controllers.ComicCharacterRelationController;
import com.tonytor.marvelhero.controllers.ComicController;
import com.tonytor.marvelhero.controllers.ImageController;
import com.tonytor.marvelhero.model.to.ComicCharacterTo;
import com.tonytor.marvelhero.services.ComicCharacterService;
import com.tonytor.marvelhero.services.ImageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import java.util.Base64;


@SuppressWarnings("EmptyMethod")
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")

class ControllersTests {

    static private final Logger logger = LoggerFactory.getLogger(ControllersTests.class);

    static private CharacterController characterController;
    static private ComicController comicController;
    static private ComicCharacterRelationController comicCharacterRelationController;
    static private ImageController imageController;

    @BeforeAll
    @Sql("classpath:data.sql")
    static void initializeService(@Autowired CharacterController characterController,
                                  @Autowired ComicController comicController,
                                  @Autowired ComicCharacterRelationController comicCharacterRelationController,
                                  @Autowired ImageController imageController,
                                  @Autowired ImageService imageService,
                                  @Autowired ComicCharacterService comicCharacterService
    ){
        logger.info(()->"initialize tests");
        ControllersTests.characterController = characterController;
        ControllersTests.comicController = comicController;
        ControllersTests.comicCharacterRelationController = comicCharacterRelationController;
        ControllersTests.imageController = imageController;

        imageService.create(ImageTestingObjects.TEST0);

        comicController.createComic(ComicTestingObjects.TEST0);
        comicController.createComic(ComicTestingObjects.TEST1);
        comicController.createComic(ComicTestingObjects.TEST2);

        characterController.createCharacter(CharacterTestingObjects.TEST0);
        characterController.createCharacter(CharacterTestingObjects.TEST1);
        characterController.createCharacter(CharacterTestingObjects.TEST2);
    }

    //CreateTests

    @Test
    void createImageTest(){
        logger.info(()->"start create image test");
        Assertions.assertEquals(
                ImageTestingObjects.TEST1.getBase64(),
                imageController.createImage(
                        Base64.getDecoder().decode(
                                ImageTestingObjects.TEST1.getBase64()
                        )
                ).getBase64());
        Assertions.assertEquals(
                ImageTestingObjects.TEST2.getBase64(),
                imageController.createImage(
                        Base64.getDecoder().decode(
                                ImageTestingObjects.TEST2.getBase64()
                        )
                ).getBase64());
    }

    @Test
    void createComicTest(){
        logger.info(()->"start create comic test");
        Assertions.assertEquals(
                ComicTestingObjects.TEST_NO_WRONG0,
                comicController.createComic(ComicTestingObjects.TEST_NO_WRONG0));
        Assertions.assertEquals(
                ComicTestingObjects.TEST_NO_WRONG1,
                comicController.createComic(ComicTestingObjects.TEST_NO_WRONG1));
    }

    @Test
    void createCharacterTest(){
        logger.info(()->"start create Character test");
        Assertions.assertEquals(
                CharacterTestingObjects.TEST_NO_WRONG0,
                characterController.createCharacter(CharacterTestingObjects.TEST_NO_WRONG0));
        Assertions.assertEquals(
                CharacterTestingObjects.TEST_NO_WRONG1,
                characterController.createCharacter(CharacterTestingObjects.TEST_NO_WRONG1));
    }

    @Test
    void createComicCharacterRelationTest(){
        logger.info(()->"start create Relation test");

        ComicCharacterTo to2 = comicCharacterRelationController.createRelationWithComic(5, 4);
        ComicCharacterTo to1 = comicCharacterRelationController.createRelationWithCharacter(5, 3);
        ComicCharacterTo to3 = comicCharacterRelationController.createRelationWithCharacter(6, 4);
        ComicCharacterTo to4 = comicCharacterRelationController.createRelationWithComic(7, 4);

        Assertions.assertEquals(CharacterTestingObjects.TEST0.getName(), to1.getNameCharacter());
        Assertions.assertEquals(ComicTestingObjects.TEST1.getName(), to1.getNameComic());

        Assertions.assertEquals(CharacterTestingObjects.TEST0.getName(), to2.getNameCharacter());
        Assertions.assertEquals(ComicTestingObjects.TEST2.getName(), to2.getNameComic());

        Assertions.assertEquals(CharacterTestingObjects.TEST1.getName(), to3.getNameCharacter());
        Assertions.assertEquals(ComicTestingObjects.TEST2.getName(), to3.getNameComic());

        Assertions.assertEquals(CharacterTestingObjects.TEST2.getName(), to4.getNameCharacter());
        Assertions.assertEquals(ComicTestingObjects.TEST2.getName(), to4.getNameComic());
    }




    //CreateWrongTests
    @Test
    void createWrongComicTest(){
    }

    @Test
    void createWrongCharacterTest(){
    }

    @Test
    void createWrongComicCharacterRelationTest(){
    }

    @Test
    void createWrongImageTest(){
    }


    //UpdateTests
    @Test
    void updateComicTest(){
    }

    @Test
    void updateCharacterTest(){
    }

    @Test
    void updateImageTest() {
    }


    //UpdateWrongTests
    @Test
    void updateWrongComicTest(){
    }

    @Test
    void updateWrongCharacterTest(){
    }

    @Test
    void updateWrongImageTest() {
    }


    //GetAllTests
    @Test
    void getAllComicTest(){
    }

    @Test
    void getAllCharacterTest(){
    }

    @Test
    void getAllImageTest(){
    }


    //GetTests
    @Test
    void getComicTest(){
    }

    @Test
    void getCharacterTest(){
    }

    @Test
    void getImageTest(){
    }


    //GetWrongTests
    @Test
    void getWrongComicTest(){
    }

    @Test
    void getWrongCharacterTest(){
    }

    @Test
    void getWrongImageTest(){
    }


    //GetCharacterComicRelationTests
    @Test
    void getCharactersFromComicTest(){
    }

    @Test
    void getComicsFromCharacterTest(){
    }


    //GetWrongCharacterComicRelationTests
    @Test
    void getWrongCharactersFromComicTest(){
    }

    @Test
    void getWrongComicsFromCharacterTest(){
    }
}
