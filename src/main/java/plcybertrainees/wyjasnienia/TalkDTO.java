package plcybertrainees.wyjasnienia;

import java.util.List;
//POJO
// Encja rowID
//ValueObject 1 parametr, metoda getter
// DTO -> Data Transfer Object
/*
Inaczej mówiąc objekt Javowy, którego zadaniem jest przenoszenie specyficznych danych.
Najczęstsze wykorzystanie:
1) komunikacja klient - server. Innymi słowy Frontend(WEB) - Backend, Aplikacja Moblie - Backend.
2) komunikacja baza danych - Backend
Cechy szczególne obiektów:
1) pola (parametry) opisujące konkretny objekt np. Samochod pola samochodu np. Makra, kolor, przebieg, etc.
2) posiadają konstruktor do prawidłowego utworzenia objektu danej klasy
3) posiada konkretne metody odwołujące się do utworzonego objektu
    (metody typu Getter, Setter, toString, etc.)
4) może posiadać wewnętrznie swój konwerter ( opcja )
np do konwersji objektu DTO bazy danych(Encji) na objekt do reprezentacji dla aplikacji Frontendowej
 */

public class TalkDTO {

    private final String tematRozmowy;//nie da nam użyć settera
    public String opis;//nie jest dobrze, bo itnieje możliwość zmiany zmiannej przez napis talkDTO.opis="";
    private List<String> przyklady;

    public TalkDTO(String tematRozmowy, String opis, List<String> przyklady) {
        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public String getOpis() {
        return opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void modifyList(List<String>wiecejPrzykladow){
        this.przyklady.addAll(wiecejPrzykladow);
    }

    public void setPrzyklady(final List<String> przyklady) {
        this.przyklady= przyklady;
    }
}
  /*  public TalkDTO(
            final String tematRozmowy,
            final List<String> przyklady) {

        if(przyklady == null || przyklady.isEmpty()) {
            throw new UncheckedException("parametr przyklady jest pusty");
        }

        this.tematRozmowy = tematRozmowy;
        this.przyklady = przyklady;

//    this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;

        //postać równoważna do: this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;

    /*
        IV konstrukcja warunkowa if
        przyklady.isEmpty() ? new ArrayList<>() : przyklady
        wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
        między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
        wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else
     */

//    if (przyklady == null || przyklady.isEmpty()) {
//      this.przyklady = new ArrayList<>();
//    } else {
//      this.przyklady = przyklady;
//    }
  /*  }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public String toString() {
        return "Informacja o klasie TalkDTO: { tematRozmowy: " + this.tematRozmowy
                + "\nPierwszy przykład: " + this.przyklady.get(0) + " }";
    }
}
*/