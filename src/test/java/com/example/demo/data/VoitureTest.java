package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture v = new Voiture("Ferrari", 2000);
        v.setPrix(2500);
        assertEquals(2500, v.getPrix());
    }
    
    @Test
    void creerVoiture2(){
        Voiture v = new Voiture("Ferrari", 2000);
        v.setId(1);
        assertEquals(1, v.getId());
    }

    @Test
    void creerVoiture3(){
        Voiture v = new Voiture("Ferrari", 2000);
        v.setMarque("Porsche");
        assertEquals("Porsche", v.getMarque());
    }

    @Test
    void creerVoiture4(){
        Voiture v = new Voiture("Ferrari", 2000);
        v.setPrix(0);
        assertEquals(0, v.getPrix());
    }

    @Test
    void creerVoiture5(){
        Voiture v = new Voiture("Ferrari", 2000);
        assertEquals("Car{marque='Ferrari', prix=2000, id=}", v.toString());
    }
}
