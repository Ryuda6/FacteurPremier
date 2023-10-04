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

    @Test
    void generate_avec_2_devrait_renvoyer_liste_2() {
        // GIVEN
        int nbr = 2;
        expectedResult.add(2);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_3_devrait_renvoyer_liste_3() {
        // GIVEN
        int nbr = 3;
        expectedResult.add(3);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_4_devrait_renvoyer_liste_2_2() {
        // GIVEN
        int nbr = 4;
        expectedResult.add(2);
        expectedResult.add(2);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_6_devrait_renvoyer_liste_2_3() {
        // GIVEN
        int nbr = 6;
        expectedResult.add(2);
        expectedResult.add(3);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_8_devrait_renvoyer_liste_2_2_2() {
        // GIVEN
        int nbr = 8;
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_9_devrait_renvoyer_liste_3_3() {
        // GIVEN
        int nbr = 9;
        expectedResult.add(3);
        expectedResult.add(3);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    void generate_avec_7_devrait_renvoyer_liste_7() {
        // GIVEN
        int nbr = 7;
        expectedResult.add(7);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_25_devrait_renvoyer_liste_5_5() {
        // GIVEN
        int nbr = 25;
        expectedResult.add(5);
        expectedResult.add(5);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void generate_avec_1001_devrait_renvoyer_liste_7_11_13() {
        // GIVEN
        int nbr = 1001;
        expectedResult.add(7);
        expectedResult.add(11);
        expectedResult.add(13);

        // WHEN
        actualResult = facteurpremier.generate(nbr);

        // THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
