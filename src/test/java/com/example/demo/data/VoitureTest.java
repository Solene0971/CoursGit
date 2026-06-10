package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    Voiture v;

    @BeforeEach
    void init(){
        v = new Voiture("Ferrari", 2000);
    }

    @Test
    void creerVoiture(){
        v.setPrix(2500);
        assertEquals(2500, v.getPrix());
    }
    
    @Test
    void creerVoiture2(){
        v.setId(1);
        assertEquals(1, v.getId());
    }

    @Test
    void creerVoiture3(){
        v.setMarque("Porsche");
        assertEquals("Porsche", v.getMarque());
    }

    @Test
    void creerVoiture4(){
        v.setPrix(0);
        assertEquals(0, v.getPrix());
    }

    @Test
    void creerVoiture5(){
        assertEquals("Car{marque='Ferrari', prix=2000, id=0}", v.toString());
    }
}
