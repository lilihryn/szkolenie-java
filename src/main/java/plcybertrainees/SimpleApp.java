package plcybertrainees;
import plcybertrainees.dziedziczenie.Kolor;
import plcybertrainees.dziedziczenie.model;
public class SimpleApp {


    public static void main(String[] args) {
        model modelPojazdu1 = new model("VW","2021","przod","Bug",
                1200,2.1,Kolor.NIEBIESKI);
        var modelPojazdu2 = new model("VW", "2020",
                "przod", "Passat", 1000,
                2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new model("VW", "2020",
                "przod",
                "Passat", 3000, 2.0,
                Kolor.ZIELONY);


        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu2);
        System.out.println(modelPojazdu1.getMarka());
        System.out.println(modelPojazdu1.getKolor());
        System.out.println(modelPojazdu1.getNaped());
    }
}

