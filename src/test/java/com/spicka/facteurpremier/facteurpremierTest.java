package com.spicka.facteurpremier;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchException;

class facteurpremierTest {
    facteurpremier facteurpremier;
    List<Integer> actualResult;
    List<Integer> expectedResult;

    @BeforeEach
    void BeforeEach() {
        facteurpremier = new facteurpremier();
        expectedResult = new ArrayList<Integer>();
        actualResult = new ArrayList<Integer>();
    }

    @AfterEach
    void AfterEach() {
        System.out.print("Test successfull\n");
    }


    @Test
    void generate_avec_1_devrait_renvoyer_liste_vide() {
         // GIVEN
         int nbr = 1;

         // WHEN
        actualResult = facteurpremier.generate(nbr);

         // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}