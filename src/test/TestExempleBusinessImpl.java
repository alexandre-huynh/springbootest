package fr.einfolearning.business;
package com.example.springbootest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TestExempleBusinessImpl{

    @Test
    public void testCalculerSommeTab(){
        ExempleBusinessImpl exempleBusiness = new ExempleBusinessImpl();

        // Calcul du résultat
        int resultat = exempleBusiness.calculerSomme(new int[] {1, 2 , 3});

        // résultat attendu
        int resultatAttendu = 7;

        Assert.isTrue(resultat==resultatAttendu, "Pas égal à 6 !");
    }
}