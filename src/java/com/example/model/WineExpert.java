package com.example.model;

import java.util.*;

public class WineExpert {

    public List getBrands(String color) {
        List brands = new ArrayList();
        if (color.equals("red")) {
            brands.add("2008 Genesis Syrah");
            brands.add("2009 Layer Cake Cabernet Sauvignon");
        } else if (color.equals("white")) {
            brands.add("2010 Leitz Dragonstone Riesling");
            brands.add("2010 Estate Argyros Atlantis White");
            brands.add("2009 Chateau Ste. Michelle & Dr. Loosen Eroica Riesling");
        } else {
            brands.add("2010 Commanderie de la Bargemone Coteaux d’Aix-en-Provence Rosé");
        }
        return (brands);
    }
}