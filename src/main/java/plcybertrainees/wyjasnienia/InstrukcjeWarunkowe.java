package plcybertrainees.wyjasnienia;

public class InstrukcjeWarunkowe {
    /*
    Instrukcja warunkowa if
    budowa if'a


    1)condition boolean-warunek sprawdzający i<0, a=b=2,2%2=0
    if(condition){
    kod jeśli warunek jest spelniony
    }
    if(2+2=4){
    println("dodawanie rowne 4);
    2)if(condition){

    } else{
    }-w przeciwnym wypadku

    if(2+2=4){
    println("dodawanie rowne 4);
    2)if(condition){

    } else{
    println("dodawanie nie rowne 4")
    }

    3)if(2+2=4){
    println("dodawanie rowne 4);
    else if(2+1=3){
    println("dodawanie rowne 3);
    } else{
    println("dodawanie nie rowne 4")
    }
     */

    // metoda ktora zawróci true false jesli podana liczba nie jest rowna 10
    public void urochom() {
        wyswietlSwitch(3);
        zadanieOd1do50(1);
        jakaPlec(Plec.KOBIETA);
        jakaPlec(Plec.MEZCZYZNA);
        jakaPlec(Plec.INNE);
        jakaPlec2("kobieta");
        jakaPlec2("mezczyzna");
        jakaPlec2("inna");

    }

    public boolean sprawdzenieRownosci(Integer liczba) {
        //!= sprawdzanie czy liczba nie rownie się liczbie
        if (liczba != 10) {
            return true;
        } else {
            return false;
        }
    }


    /*
    SWITCH instrukcja warunkowa

    używa się do enum
    się bazuje na konkretnych typach

    condition=1
    switch (condition)
     { case "1":
     break; //condition==1
     case "2":
     break; //condition==2
     . . .
     default: //jak nic nie pasuje, to prowadzimy jakiejs operacji
     }
      switch (condition)
     { case "1":
     case"Poniedzialek";
     println("TO jest poniedzialek");//wyswietla jeżeli jeden z warónkow się sprawdza
     break; przerywa instrukcje po wypelnieniu instrukcji
     case "2":
     break; //condition==2
     . . .
     default: //jak nic nie pasuje, to prowadzimy jakiejs operacji
     }

     */

    //utworzyć metodę, która na podany (String,Intiger)parametr wejściowy wyswietli odpowiedający dzień tygodnia
    public void wyswietlSwitch(Integer jakiDzienTygodnia) {


        switch (jakiDzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("NieprawidLowy dzien");

        }

    }

    /* Zadanie Wykonać metodę która będzie iterować od 1 do 50 i wyświetli w konsoli odpowiednie napisy:
    dla 0 → Wyświetlam zero
    dla 5 → Wyświetlam 5
    dla 10 → To jest 10
     dla 30 → To jest liczba 30
     dla 49 → To jest liczba 49
     dla pozostałych → Wskazana liczba jest inna niż oczekiwana */
    public void zadanieOd1do50(Integer cale) {
        for (cale = 0; cale <= 50; cale++) {
            switch (cale) {
                case 0:
                    System.out.println("Wyswietlam 0");
                    break;
                case 5:
                    System.out.println("Wyświetlam 5");
                    break;
                case 10:
                    System.out.println("To jest 10");
                    break;
                case 30:
                    System.out.println("To jest liczba 30");
                    break;
                case 49:
                    System.out.println("To jest liczba 49");
                    break;
                default:
                    System.out.println("Wskazana liczba jest inna niż oczekiwana");

            }

        }
    }

    enum Plec {KOBIETA, MEZCZYZNA, INNE}

    private void jakaPlec(Plec plec) {
        if (plec == Plec.KOBIETA) {
            System.out.println("Jestem kobieta");
        } else {
            if (plec == Plec.MEZCZYZNA) {
                System.out.println("Jestem mezczyzna");
            } else {
                System.out.println("Inne");
            }
        }
        switch (plec) {
            case KOBIETA -> {
                System.out.println("Jestem kobieta");
            }
            case MEZCZYZNA -> {
                System.out.println("Jestem mezczyzna");
            }
            default -> {
                System.out.println("Inne");
            }
        }


    }

    private void jakaPlec2(String plec2) {


        if (plec2 == "kobieta") {
            System.out.println("Kobieta");
        } else if (plec2 == "mezczyzna") {
            System.out.println("Mezczyzna");

        } else if (plec2 == "inna") {
            System.out.println("Inna");

        }
       switch(plec2){
           case "kobieta" -> {
               System.out.println("Kobieta");
               break;
           }
           case "mezczyzna" -> {
               System.out.println("Mezczyzna");
               break;
           }
           case "inna" -> {
               System.out.println("Inna");
               break;
           }
           default->
               System.out.println("Pomylka");

       }

    }
}

