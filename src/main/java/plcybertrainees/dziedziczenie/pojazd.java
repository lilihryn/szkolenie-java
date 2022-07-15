package plcybertrainees.dziedziczenie;

public class pojazd {
    /* nowa klasa(marka pojazdu) */
    private String marka;
    private String rocznik;
    private String naped;
    public pojazd(){
        marka="";
        rocznik="";
        naped ="";
    }
//alt+fn+del=constructor menu//

    public pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }
    public String toString(){
        return "marka:"+this.marka
                +"rocznik:"+this.rocznik
                +"napęd:"+this.naped;

        }
    public String getMarka(){
        return marka;
    }
    public String getRocznik(){
        return rocznik;
    }
    public String getNaped(){
        return naped;
    }
    //gettery metody ktore pobieraja informacje z polklasy dla przetwarzania//


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRocznik(String rocznik) {
        this.rocznik = rocznik;
    }

    public void setNaped(String naped) {
        this.naped = naped;
    }
}
