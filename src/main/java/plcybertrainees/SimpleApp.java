package plcybertrainees;

import plcybertrainees.dziedziczenie.Kolor;
import plcybertrainees.dziedziczenie.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleApp {


    public static void main(String[] args) {
        model modelPojazdu1 = new model();
        var modelPojazdu2 = new model("VW", "2020",
                "przod", "Passat", 1000,
                2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new model("VW", "2020",
                "przod",
                "Passat", 3000, 2.0,
                Kolor.ZIELONY);

        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setMarka("VW");
        modelPojazdu1.setRocznik("2021");
        modelPojazdu1.setNaped("przod");
        modelPojazdu1.setPojemnoscSilnika(2.1);
        modelPojazdu1.setNazwa("Passat");
        modelPojazdu1.setPrzebieg(1000);

        List<String>strings= new ArrayList<String>();
        strings.add("pierwszy");
        strings.add("drugi");
        System.out.println(strings.get(1));




        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu2);
        System.out.println(modelPojazdu1.getMarka());
        System.out.println(modelPojazdu1.getKolor());
        System.out.println(modelPojazdu1.getNaped());
    }
}

