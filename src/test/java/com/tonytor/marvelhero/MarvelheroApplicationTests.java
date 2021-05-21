package com.tonytor.marvelhero;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
//@Sql("classpath:data.sql")
class MarvelheroApplicationTests {

    @Test
    void contextLoads() {
    }

}

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
//@Sql("classpath:data.sql")
class CharacterControllerTests {

    @Test
    void contextLoads() {
    }

}

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
//@Sql("classpath:data.sql")
class ComicControllerTests {

    @Test
    void contextLoads() {
    }

}
