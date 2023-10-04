package com.spicka.facteurpremier;
import java.util.ArrayList;
import java.util.List;
public class facteurpremier {
    public static List<Integer> generate(int nbr)    {

        List<Integer> listefacteurpremier = new ArrayList<Integer>();
        if (nbr >2) {
            listefacteurpremier.add(3);
        }
        else if (nbr >1) {
            listefacteurpremier.add(2);
        }
        return listefacteurpremier;
        }
    }

