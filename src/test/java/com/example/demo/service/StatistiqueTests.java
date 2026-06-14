package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class StatistiqueTests {

    private StatistiqueImpl statistique;

    @BeforeEach
    void init() {
        statistique = new StatistiqueImpl();
    }

    @Test
    void testStatistique() {
        Voiture v1 = new Voiture("Ferrari", 2000);
        Voiture v2 = new Voiture("Porsche", 3000);
        statistique.ajouter(v1);
        statistique.ajouter(v2);
        Echantillon echantillon = statistique.prixMoyen();
        assertEquals(2500, echantillon.getPrixMoyen());
        assertEquals(2, echantillon.getNombreDeVoitures());
    }

    @Test
    void testStatistiqueEmpty() {
        assertThrows(ArithmeticException.class, statistique::prixMoyen);
    }

}
