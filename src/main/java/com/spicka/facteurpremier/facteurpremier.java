package com.spicka.facteurpremier;
import java.util.ArrayList;
import java.util.List;
public class facteurpremier {
    public static List<Integer> generate(int nbr)    {
        List<Integer> listefacteurpremier = new ArrayList<Integer>();
            while (nbr > 1) {
                for (int i = 2; i <= nbr; i++) {
                    if (nbr % i == 0) {
                        listefacteurpremier.add(i);
                        nbr = nbr / i;
                        break;
                    }
                }
            }
            return listefacteurpremier;
    }
}

