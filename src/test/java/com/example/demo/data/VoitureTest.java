package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    private Voiture v;

    @BeforeEach
    void init(){
        v = new Voiture("Ferrari", 2000);
    }

    @Test
    void testVoitureVide(){
        v = new Voiture();
        assertEquals("Car{marque='null', prix=0, id=0}", v.toString());
    }

    @Test
    void testSetPrix(){
        v.setPrix(2500);
        assertEquals(2500, v.getPrix());
    }
    
    @Test
    void testSetId(){
        v.setId(1);
        assertEquals(1, v.getId());
    }

    @Test
    void testSetMarque(){
        v.setMarque("Porsche");
        assertEquals("Porsche", v.getMarque());
    }

    @Test
    void testSetPrixZero(){
        v.setPrix(0);
        assertEquals(0, v.getPrix());
    }

    @Test
    void testCreerVoitureSimple(){
        assertEquals("Car{marque='Ferrari', prix=2000, id=0}", v.toString());
    }
}
