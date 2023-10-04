package com.spicka.facteurpremier;
import java.util.ArrayList;
import java.util.List;
public class facteurpremier {
    public static List<Integer> generate(int nbr)    {

        List<Integer> listefacteurpremier = new ArrayList<Integer>();
        if (nbr != 1)
        {
            if (nbr % 2 != 0) {
                listefacteurpremier.add(3);
            }
            if (nbr % 2 == 0) {
                while (nbr >1)
                {
                    nbr = nbr / 2;
                    listefacteurpremier.add(2);
                }
            }
        }
        return listefacteurpremier;
    }
}

