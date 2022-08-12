package plcybertrainees.wyjasnienia;

import java.util.ArrayList;
import java.util.List;

public class Obiekty {
    private void wyswietlTalk() {

        List<String> list = new ArrayList<>();
        list.add("przyklad1");
        TalkDTO talkDTO = new TalkDTO("Objektowosc", "Operacje na obiektach", list);
        //System.out.println(talkDTO.toString());
        //System.out.println("Dzis zajmujemy sie tematem :"+ talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());
      //  talkDTO.opis = "";powoduje niezadane przypisanije zmiannej znaczenia w dto
        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());
//1 wwrsja dodawania parametrów do listy
        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");
        talkDTO.modifyList(wiecej);
//2wersja
        List<String> wiecej2 = new ArrayList<>();
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przyklad4");
        talkDTO.modifyList(wiecej2);
        System.out.println(talkDTO.getPrzyklady());
        talkDTO.setPrzyklady(wiecej2);
        System.out.println(talkDTO.getPrzyklady());
//3wersja
        talkDTO= new TalkDTO("Objektowosc", "Operacje na obiektach", wiecej2);
        System.out.println(talkDTO.getPrzyklady());
    }

    public void uruchom() {
        wyswietlTalk();
    }
}
