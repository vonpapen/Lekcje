public class Poczta {

    public String adresat;
    public String aAdres;
    public String aKod;
    public String nadawca;
    public String nAdres;
    public String nKod;
    public int rPrzesylki;

    Poczta(String adresat, String aAdres, String aKod, String nadawca, String nAdres, String nKod, int rPrzesylki){
        adresat=adresat;
        aAdres=aAdres;
        aKod=aKod;
        nadawca=nadawca;
        nAdres=nAdres;
        nKod=nKod;
        rPrzesylki=rPrzesylki;
    }

    public void wyswietl(){
        System.out.println("Adresat: " + adresat);
        System.out.println("Adres adresata: " + aAdres);
        System.out.println("Kod pocztowy adresata: " + aKod);

        System.out.println("Nadawca: " + nadawca);
        System.out.println("Adres nadawcy: " + nAdres);
        System.out.println("Kod pocztowy nadawcy: " + nKod);

        if(rPrzesylki==1){
            System.out.println("Rodzaj przesylki: list");
        }else if(rPrzesylki==2){
            System.out.println("Rodzaj przesylki: paczka");
        }else{
            System.out.println("Rodzaj przesylki: niestandardowa");
        }
    }
}
