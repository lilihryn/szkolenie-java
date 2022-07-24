package plcybertrainees.wyjasnienia;

public class Kratnosc {

    public Integer dzielenieNaTrzyiPiec(int kratne) {

        if (kratne % 3 % 5 == 0) {
            System.out.println("Liczba kratna 3i5");
        } else {
            System.out.println("Liczba nie kratna 3i5");
        }
        return null;
    }
}
