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

    public boolean sprawdzenieRownosci(Integer liczba){
        //!= sprawdzanie czy liczba nie rownie się liczbie
        if(liczba!=10) {
            return true;
        }else {
            return false;
        }
    }
}
}
