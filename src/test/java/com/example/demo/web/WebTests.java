package com.example.demo.web;

import com.example.demo.data.Voiture;
import com.example.demo.service.Echantillon;
import com.example.demo.service.StatistiqueImpl;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class WebTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Autowired
    MockMvc mockMvc;

    @Test
    void testcreerVoitures() throws Exception {
        mockMvc.perform(post("/voiture")                                        // POST vers le chemin /voiture
                        .contentType(MediaType.APPLICATION_JSON)                // la requête prend du JSON
                        .content("{\"marque\":\"Subaru\", \"prix\": 100}"))     // les paramètres de la requête (en JSON)
                        .andDo(print())                                         // affiche les logs en console
                        .andExpect(status().isOk());                            // attend un code de retour 200 (pas d'erreur)
        verify(statistiqueImpl, times(1)).ajouter(any(Voiture.class));}      // vérifie que la méthode ajouter a été appelée une fois avec n'importe quelle voiture
}