package com.spicka.facteurpremier;
import java.util.ArrayList;
import java.util.List;
public class facteurpremier {
    public static List<Integer> generate(int nbr)    {

        List<Integer> listefacteurpremier = new ArrayList<Integer>();
        if (nbr != 1)
        {
            while (nbr >1)
            {
                if (nbr % 2 == 0) {
                    nbr = nbr / 2;
                    listefacteurpremier.add(2);
                }
                else if (nbr % 3 == 0){
                    nbr = nbr / 3;
                    listefacteurpremier.add(3);
                }
            }
        }
        return listefacteurpremier;
    }
}

