package plcybertrainees.dziedziczenie;
//exteds slowo kluczowe przy dziedziczeniu klas
public class model extends pojazd{
    private String nazwa;
    private  Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;
    //alt+enter//

    public model(){
       super();
       this.nazwa="";
       this.przebieg=0;
       this.pojemnoscSilnika=0.0;
       this.kolor=null;

    }

    public model(final String marka, final String rocznik,
                 final String naped, final String nazwa,
                 final Integer przebieg, final Double pojemnoscSilnika,
                 final Kolor kolor) {
        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }
    @Override
    public String toString(){
        return   "marka:"+ getMarka()
                +"rocznik:"+ getRocznik()
                +"naped:"+getNaped()
                +"nazwa modelu"+this.nazwa
                +"przebieg:"+this.przebieg
                +"pojemnoscSilnika:"+this.pojemnoscSilnika
                +"kolor:"+this.kolor;

    }//adnotacja javova, przeslonianie metod//
    //ctrl w,rolka myszki//
    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public Integer getPrzebieg(){
            return przebieg;
    }
    public String getNazwa(){
        return nazwa;
    }
    public Kolor getKolor(){
        return kolor;
    }
    public void setPrzebieg(final Integer przebieg) {
        this.przebieg = przebieg;
    }

    public void setNazwa(final String nazwa){
        this.nazwa=nazwa;
        }
    public void setPojemnoscSilnika(final Double pojemnoscSilnika){
        this.pojemnoscSilnika=pojemnoscSilnika;
    }
    public void setKolor(final Kolor kolor){

    this.kolor=kolor;
    }
// ctrl spacja-przegląd dostępnych zmiaannych
}
